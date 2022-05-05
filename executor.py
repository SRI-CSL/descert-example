import itertools
import math
import os
import random
import sys
import typing as ty
from concurrent.futures.process import BrokenProcessPool
from multiprocessing.dummy import Pool as ThreadPool
from time import sleep

from tqdm import tqdm

CPU_COUNT = os.cpu_count()

OutputType = ty.TypeVar("OutputType")


def noop(results):
    return results


def partition(items: ty.Iterable[OutputType], chunk_size: ty.Optional[int]) -> ty.Iterable[ty.List[OutputType]]:

    positive_int = isinstance(chunk_size, int) and chunk_size > 0
    if not(chunk_size is None or positive_int):
        raise ValueError("Chunk size must be a positive int (or None)")

    iterator = iter(items)
    part = list(itertools.islice(iterator, chunk_size))
    while part:
        yield part
        part = list(itertools.islice(iterator, chunk_size))
        

class ExecutorProcessingError(Exception):
    def __init__(self, description: str, results: ty.List[ty.Any], exceptions: ty.List[Exception]):
        self.description = description
        self.results = results
        self.exceptions = exceptions

    def __str__(self):
        return str(self.results)

    def __repr__(self):
        return repr(self.results)


class Task:
    def __init__(self):
        pass
    

def paused(start=3, stop=60, fixed=False):
    # TODO(has) make this more general. right now it
    # works only on dot_generator
    napsecs = start
    if not fixed:
        napsecs = random.uniform(start, stop)

    def sleepnow(function):
        def wrapper(*args, **kwargs):
            try:
                result = function(*args, **kwargs)
                sleep(napsecs)
                if isinstance(result, tuple):
                    return tuple(result)
                return result
                # return x, y, z
            except Exception as ex:
                print(ex)
                return None, None, False

        return wrapper

    return sleepnow


def _execute_in_parallel(tasks: ty.List[Task],
                         work_fn: ty.Callable,
                         desc: str,
                         transf_fn: ty.Callable = None) -> ty.List[ty.Any]:
    """Parallel execution of workers"""
    results = []
    exceptions = []

    if not tasks:
        return results

    transf_fn = transf_fn if transf_fn is not None else noop
    total_tasks = len(tasks)

    with ThreadPool() as worker_pool:
        try:
            with tqdm(total=total_tasks, desc=desc) as pbar:
                for result in worker_pool.imap(work_fn, tasks, ):
                    results += [result]
                    pbar.update()
        except BrokenProcessPool as e:
            print(f"ThreadPool terminated abruptly: {e}")
            sys.exit(1)
        except KeyboardInterrupt:
            print("ThreadPool interrupted manually")
            sys.exit(0)
        except Exception as e:
            exceptions.append(e)

        if exceptions:
            raise ExecutorProcessingError(
                "ThreadPool finished with exceptions",
                results,
                exceptions)
    return transf_fn(results)


def execute_batch_parallel(tasks: ty.List[Task],
                           work_fn: ty.Callable,
                           desc: str = None,
                           transf_fn: ty.Callable = None,
                           batch_size: int = None) -> ty.List[ty.Any]:
    if not tasks:
        raise ValueError("No tasks to batch-processed")

    transf_fn = transf_fn if transf_fn is not None else noop
    total_tasks = len(tasks)

    if batch_size is None or batch_size < 1:
        # calculate batch size
        batch_size = int(math.ceil(total_tasks / float(CPU_COUNT)))

    desc = desc if desc is not None else 'exec'

    results = []
    try:
        for i, batch in enumerate(partition(tasks, batch_size)):
            result = _execute_in_parallel(batch, work_fn, desc=f"{desc}-batch-{i}")
            if result:
                results.extend(result)
    except ExecutorProcessingError as e:
        sys.stderr.write(f"batch-processor terminated with an error: {e.description}\n")
        results.extend(e.results)

    return transf_fn(results)


if __name__ == "__main__":
  pass

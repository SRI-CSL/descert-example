import heapq
import inspect
import logging
import os
import random
import sys
import time
import warnings
from enum import Enum
from functools import wraps
from logging.handlers import RotatingFileHandler
from time import sleep

import numpy as np
# # Snowball stemmers could be used as a dependency
# from nltk.stem import SnowballStemmer
from six import string_types


# @keep
def create_logger(file, backup_count=100):
    wd = os.path.dirname(os.path.realpath(__file__))
    ld = os.path.join(wd, "logs")
    if not os.path.isdir(ld):
        os.makedirs(ld)

    name = os.path.splitext(os.path.basename(file))[0]
    log_format = (
        "%(asctime)s::%(levelname)s::%(name)s::" "%(filename)s::%(lineno)d::%(message)s"
    )

    # Main logger
    logger = logging.getLogger(name)
    logger.setLevel(logging.INFO)

    log_formatter = logging.Formatter(log_format)

    # on screen output
    console = logging.StreamHandler()
    console.setLevel(logging.INFO)
    console_formatter = logging.Formatter("%(name)-12s: %(levelname)-8s %(message)s")
    console.setFormatter(console_formatter)

    # debug logging
    debug_log = os.path.join(ld, f"{name}.log")
    debug_handler = RotatingFileHandler(
        debug_log, mode='w', maxBytes=3e+7, backupCount=backup_count)
    debug_handler.setLevel(logging.DEBUG)
    debug_handler.setFormatter(log_formatter)

    error_log = os.path.join(ld, f"{name}_error.log")
    error_handler = RotatingFileHandler(
        error_log, mode='w', maxBytes=3e+7, backupCount=backup_count)
    error_handler.setLevel(logging.WARNING)
    error_handler.setFormatter(log_formatter)

    logger.addHandler(console)
    logger.addHandler(debug_handler)
    logger.addHandler(error_handler)

    return logger
  
if __name__ == "__main__":
  pass

# Daikon issues


If you have not set up Docker on your computer yet, follow Docker's instructions to install Docker:
https://docs.docker.com/get-docker/

The goal is to setup this project with CircleCI and generate evidence (in this case Randoop and Daikon results)
as part of the build process.

Currently, this project applies only the `daikon-gradle-plugin`. Unfortunately, I've not been able to produce any Daikon output.

Below are a few scenarios I've tried in order to debug this project's debug process.

# Failed scenarios

## Using circleci/openjdk:8-jdk Docker image

1. Build Docker image

```sh
› docker build -t descert/descert-example-circleci -f docker/Dockerfile .
```

2. Run it

```sh
› docker run --rm -it descert-example-circleci /bin/bash
# ./gradlew daikonRun --debug
```

3. Error (from daikon.DynComp)

See log: [circleci-build.txt](https://github.com/SRI-CSL/descert-example/files/5569498/circleci-build.txt)


## Using amazoncorretto:8-alpine-full Docker image

### Steps

1. Build Docker image

```sh
› docker build -t descert/descert-example-amzn -f docker/Dockerfile .
```

2. Run it

```sh
› docker run --rm -it descert-example-amzn /bin/bash
# ./gradlew daikonRun --debug
```

3. Error (from daikon.DynComp)

```sh
# Writing decl file to ../../../../../daikon-output/AutoGeneratedTestDriver.decls-DynComp
#
# transform on java/nio/file/StandardOpenOption, loader: null
# Skipping in_shutdown class java/nio/file/StandardOpenOption
#
# transform on java/nio/file/attribute/FileAttribute, loader: null
# Skipping in_shutdown class java/nio/file/attribute/FileAttribute
#
# transform on sun/nio/fs/UnixFileModeAttribute, loader: null
# Skipping in_shutdown class sun/nio/fs/UnixFileModeAttribute
#
# transform on sun/nio/fs/UnixChannelFactory, loader: null
# Skipping in_shutdown class sun/nio/fs/UnixChannelFactory
#
# transform on sun/nio/fs/UnixChannelFactory$Flags, loader: null
# Skipping in_shutdown class sun/nio/fs/UnixChannelFactory$Flags
#
# transform on sun/nio/fs/UnixChannelFactory$1, loader: null
# Skipping in_shutdown class sun/nio/fs/UnixChannelFactory$1
#
# transform on java/lang/Throwable$WrappedPrintStream, loader: null
# Skipping in_shutdown class java/lang/Throwable$WrappedPrintStream
#
# transform on java/lang/Throwable$PrintStreamOrWriter, loader: null
# Skipping in_shutdown class java/lang/Throwable$PrintStreamOrWriter
# Exception in thread "Thread-0" java.lang.Error: Can't open ../../../../../daikon-output/AutoGeneratedTestDriver.decls-DynComp
# 	at daikon.dcomp.Premain.open(Premain.java:465)
# 	at daikon.dcomp.Premain$ShutdownThread.run(Premain.java:436)
# Caused by: java.nio.file.NoSuchFileException: ../../../../../daikon-output/AutoGeneratedTestDriver.decls-DynComp
# 	at sun.nio.fs.UnixException.translateToIOException(UnixException.java:86)
# 	at sun.nio.fs.UnixException.rethrowAsIOException(UnixException.java:102)
# 	at sun.nio.fs.UnixException.rethrowAsIOException(UnixException.java:107)
# 	at sun.nio.fs.UnixFileSystemProvider.newByteChannel(UnixFileSystemProvider.java:214)
# 	at java.nio.file.spi.FileSystemProvider.newOutputStream(FileSystemProvider.java:434)
# 	at java.nio.file.Files.newOutputStream(Files.java:216)
# 	at java.nio.file.Files.newBufferedWriter(Files.java:2860)
# 	at daikon.dcomp.Premain.open(Premain.java:460)
# 	... 1 more
# FYI Working directory: /usr/local/src/descert-example/build/classes/java/test/com/foo
```

**Additional details can be found at** [dyncomp.log](https://github.com/SRI-CSL/descert-example/files/5563884/dyncomp.log)


## Using either gradle:6.7.1-jdk8-hotspot or openjdk:8 Docker image

### Steps

1. Build Docker image

```sh
› docker build -t descert/descert-example-gradle -f docker/Dockerfile .
```
2. Run it

```sh
› docker run --rm -it descert/descert-example-gradle /bin/bash
# ./gradlew daikonRun --debug
```

3. Error
The previous command will produce the following error message,
when executing `daikon.DynComp`

```sh
Error occurred during initialization of VM
java.lang.UnsatisfiedLinkError: sun.misc.Unsafe.isBigEndian0()Z
	at sun.misc.Unsafe.isBigEndian0(Native Method)
	at sun.misc.Unsafe.<clinit>(Unsafe.java:1233)
	at sun.misc.SharedSecrets.<clinit>(SharedSecrets.java:48)
	at java.lang.ref.Reference.<clinit>(Reference.java:235)
```

**`daikon.DynComp` verbose mode did not produce any meaningful information.**


## Using cimg/openjdk:8.0.272 Docker image

Make sure you update the docker/Dockerfile's content with 
the content of 

### Steps

1. Build Docker image

```sh
› docker build -t descert/descert-example-cimg -f docker/Dockerfile .
```


2. Run it

```sh
› docker run --rm -it descert/descert-example-cimg /bin/bash
```

3. Error

Fails when executing the `./gradlew clean` task:

```sh
Gradle could not start your build.
> Could not create service of type CrossBuildFileHashCache using BuildSessionServices.createCrossBuildFileHashCache().
   > Failed to create parent directory '/usr/local/src/descert-example/.gradle' when creating directory '/usr/local/src/descert-example/.gradle/6.7.1/fileHashes'
```

## Using gehighassurance/rack-box:v3.02 Docker image


1. Build Docker image

```sh
› docker build -t descert/descert-example-rack -f docker/Dockerfile .
```


2. Run it

```sh
› docker run --rm -it --memory="8g" descert/descert-example-rack /bin/sh
```

3. Error

Very slow. It eventually crashed due to out of memory errors.

```sh
runtime stack:
runtime.throw(0x8b67b4, 0x16)
	/usr/local/go/src/runtime/panic.go:774 +0x72 fp=0x7ffdc510c0c8 sp=0x7ffdc510c098 pc=0x42fa52
runtime.sysMap(0xc000000000, 0x4000000, 0xc1b978)
	/usr/local/go/src/runtime/mem_linux.go:169 +0xc5 fp=0x7ffdc510c108 sp=0x7ffdc510c0c8 pc=0x419d65
runtime.(*mheap).sysAlloc(0xbfde20, 0x2000, 0x0, 0x0)
	/usr/local/go/src/runtime/malloc.go:701 +0x1cd fp=0x7ffdc510c1b0 sp=0x7ffdc510c108 pc=0x40cfdd
runtime.(*mheap).grow(0xbfde20, 0x1, 0xffffffff)
	/usr/local/go/src/runtime/mheap.go:1255 +0xa3 fp=0x7ffdc510c200 sp=0x7ffdc510c1b0 pc=0x427e13
runtime.(*mheap).allocSpanLocked(0xbfde20, 0x1, 0xc1b988, 0x1)
	/usr/local/go/src/runtime/mheap.go:1170 +0x266 fp=0x7ffdc510c280 sp=0x7ffdc510c200 pc=0x427ca6
runtime.(*mheap).alloc_m(0xbfde20, 0x1, 0x45002a, 0x0)
	/usr/local/go/src/runtime/mheap.go:1022 +0xc2 fp=0x7ffdc510c2d0 sp=0x7ffdc510c280 pc=0x427542
runtime.(*mheap).alloc.func1()
	/usr/local/go/src/runtime/mheap.go:1093 +0x4c fp=0x7ffdc510c308 sp=0x7ffdc510c2d0 pc=0x45882c
runtime.(*mheap).alloc(0xbfde20, 0x1, 0x1002a, 0x40000)
	/usr/local/go/src/runtime/mheap.go:1092 +0x8a fp=0x7ffdc510c358 sp=0x7ffdc510c308 pc=0x42782a
runtime.(*mcentral).grow(0xbfec58, 0x0)
	/usr/local/go/src/runtime/mcentral.go:255 +0x7b fp=0x7ffdc510c398 sp=0x7ffdc510c358 pc=0x41978b
runtime.(*mcentral).cacheSpan(0xbfec58, 0x7fe12f9f5000)
	/usr/local/go/src/runtime/mcentral.go:106 +0x2fe fp=0x7ffdc510c3f8 sp=0x7ffdc510c398 pc=0x4192ae
runtime.(*mcache).refill(0x7fe12f9f5008, 0x2a)
	/usr/local/go/src/runtime/mcache.go:138 +0x85 fp=0x7ffdc510c418 sp=0x7ffdc510c3f8 pc=0x418d55
runtime.(*mcache).nextFree(0x7fe12f9f5008, 0xc1b92a, 0x7fe12f9f5008, 0x8, 0xfffffffffffffff8)
	/usr/local/go/src/runtime/malloc.go:854 +0x87 fp=0x7ffdc510c450 sp=0x7ffdc510c418 pc=0x40d807
runtime.mallocgc(0x180, 0x8abc20, 0x1, 0xc1b9e0)
	/usr/local/go/src/runtime/malloc.go:1022 +0x793 fp=0x7ffdc510c4f0 sp=0x7ffdc510c450 pc=0x40e143
runtime.newobject(0x8abc20, 0x4000)
	/usr/local/go/src/runtime/malloc.go:1151 +0x38 fp=0x7ffdc510c520 sp=0x7ffdc510c4f0 pc=0x40e538
runtime.malg(0xd1f00008000, 0xc004c8)
	/usr/local/go/src/runtime/proc.go:3232 +0x31 fp=0x7ffdc510c560 sp=0x7ffdc510c520 pc=0x438e71
runtime.mpreinit(...)
	/usr/local/go/src/runtime/os_linux.go:324
runtime.mcommoninit(0xbf9120)
	/usr/local/go/src/runtime/proc.go:626 +0xc2 fp=0x7ffdc510c598 sp=0x7ffdc510c560 pc=0x432812
runtime.schedinit()
	/usr/local/go/src/runtime/proc.go:543 +0x72 fp=0x7ffdc510c5f0 sp=0x7ffdc510c598 pc=0x432472
runtime.rt0_go(0x7ffdc510c738, 0xa, 0x7ffdc510c738, 0x400530, 0x750ad1, 0x0, 0xa00000000, 0x7ffdc510c738, 0x45ab40, 0x0, ...)
	/usr/local/go/src/runtime/asm_amd64.s:214 +0x125 fp=0x7ffdc510c5f8 sp=0x7ffdc510c5f0 pc=0x45ac75
: unknown
```

**UPDATE**

Did not get the oom error once I Increased memory to 8gb and number of cpus to 8 on the Docker client.
Unfortunately, the SPARQLgraph UI stopped working.

Next, we will try the following:

```sh
› docker run --detach -p 80:80 -p 12050-12092:12050-12092 gehighassurance/rack-box:v3.0
› docker exec -it CONTAINER_ID /bin/sh
# apt-get update && apt-get install -y git vim
# cd ~ ; git clone https://github.com/SRI-CSL/descert-example.git
# cd descert-example
# ./gradlew clean; ./gradlew build; ./gradlew daikonRun --debug 
```

Then

```sh
› docker container commit CONTAINER descert/rack-box:v3.0
```

**Here are the results (from daikon.DynComp)**: [dynComp-rack.txt](https://github.com/SRI-CSL/descert-example/files/5569243/dynComp-rack.txt)




# Bazel Build Experimentation

This project explores the Bazel build system.  It includes a simple script on how to create an Intellij module and example binaries in python/java/scala/c++ for the Fibonacci sequence.

## Running Binaries

Below are examples of how to build and run the Fib function in Java, Scala and Python.  I put the
function in a new folder to make the build structure a bit more interesting.

### Java

```
>> bazel build //src/main/java/engine:bin
>> bazel-bin/src/main/java/engine/bin
Fib(10)=55
```

### Scala

```
>> bazel build //src/main/scala/engine:bin
>> bazel-bin/src/main/scala/engine/bin
Fib(10)=55
```

### Python

```
>> bazel build //src/main/python/engine:bin
>> bazel-bin/src/main/python/engine/bin
Fib(10)=55
```

### C++

```
>> bazel build //src/main/cpp/engine:bin
>> bazel-bin/src/main/cpp/engine/bin
Fib(10)=55
```

### Pure C

```
>> bazel build //src/main/cpp/engine:bin
>> bazel-bin/src/main/cpp/engine/bin
Fib(10)=55
```
# Experimental results

*Lab Completed by Ken Broden*

## Instructions for Running Tests

1. **Compile the Java files:**

    ```sh
    cd src
    javac echoserver/*.java
    cd ..
    ```

2. **Run the Bats tests:**

    ```sh
    ./test/run_tests.sh
    ```

3. **Run the stress-testing script:**

    ```sh
    ./stress_test.sh <numCalls> <bigFile>
    ```

## Test Results

### Bats Tests

#### Server Tests

```console
ok 6 Your server code compiles
ok 7 Your server starts successfully
ok 8 Your server handles a small bit of text
ok 9 Your server handles a large chunk of text
ok 10 Your server handles binary content
```

#### Client Tests

```console
ok 1 Your client code compiles
ok 2 Your client runs successfully
ok 3 Your client handles a small bit of text
ok 4 Your client handles a large chunk of text
ok 5 Your client handles binary content
```

#### Client-Server Pair Tests

```console
ok 11 Your client/server pair handles a small bit of text
ok 12 Your client/server pair handles a large chunk of text
ok 13 Your client/server pair handles binary content
```

### Stress Test Results

#### Test Configuration

- **Number of Calls:**
- **File Transferred:**
- **Machine Specifications:**
  - CPU:
  - RAM:
  - OS:

#### Execution Time

- **Start Time:**
- **End Time:**
- **Total Duration:**

#### Observations

- **Single-threaded Approach:**
  - Execution Time:
  - Observations:

- **Multi-threaded Approach:**
  - Execution Time:
  - Observations:

## Summary

- **Comparison of Single-threaded vs Multi-threaded:**
  - Execution Time Difference:
  - Performance Impact:
  - Other Observations:

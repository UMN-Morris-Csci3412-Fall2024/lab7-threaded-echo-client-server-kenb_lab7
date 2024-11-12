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

- **Number of Calls:** 10
- **File Transferred:** `words.txt`
- **Machine Specifications:**
  - CPU: 11th Gen Intel® Core™ i5-11600 @ 2.80GHz × 12
  - RAM: 15.0 GiB
  - OS: Rocky Linux 9.4 (Blue Onyx)

#### Test 1: 10 Parallel Client Connections

#### Configuration

- Number of Calls: 10
- File Transferred: `test/etc/words.txt`

#### Execution Time

- **Start Time:** Mon Nov 11 06:17:47 PM CST 2024
- **End Time:** Mon Nov 11 06:17:48 PM CST 2024
- **Total Duration:** 1 second

#### Terminal Input and Output

```console
[brod@avenger lab7]$ chmod +x test/stress_test.sh
[brod@avenger lab7]$ ./test/stress_test.sh 10 test/etc/words.txt
Doing run 0
Doing run 1
Doing run 2
Doing run 3
Doing run 4
Doing run 5
Doing run 6
Doing run 7
Doing run 8
Doing run 9
Now waiting for all the processes to terminate
Mon Nov 11 06:17:47 PM CST 2024
Done waiting; all processes are finished
Mon Nov 11 06:17:48 PM CST 2024
```

#### Test 2: 50 Parallel Client Connections

#### Configuration 2

- Number of Calls: 50
- File Transferred: `test/etc/words.txt`

#### Execution Time 2

- **Start Time:** Mon Nov 11 06:36:14 PM CST 2024
- **End Time:** Mon Nov 11 06:36:16 PM CST 2024
- **Total Duration:** 2 seconds

#### Terminal Input and Output 2

```console
[brod@avenger lab7]$ ./test/stress_test.sh 50 test/etc/words.txt
Doing run 0
Doing run 1
Doing run 2
Doing run 3
Doing run 4
Doing run 5
Doing run 6
Doing run 7
Doing run 8
Doing run 9
Doing run 10
Doing run 11
Doing run 12
Doing run 13
Doing run 14
Doing run 15
Doing run 16
Doing run 17
Doing run 18
Doing run 19
Doing run 20
Doing run 21
Doing run 22
Doing run 23
Doing run 24
Doing run 25
Doing run 26
Doing run 27
Doing run 28
Doing run 29
Doing run 30
Doing run 31
Doing run 32
Doing run 33
Doing run 34
Doing run 35
Doing run 36
Doing run 37
Doing run 38
Doing run 39
Doing run 40
Doing run 41
Doing run 42
Doing run 43
Doing run 44
Doing run 45
Doing run 46
Doing run 47
Doing run 48
Doing run 49
Now waiting for all the processes to terminate
Mon Nov 11 06:36:14 PM CST 2024
Done waiting; all processes are finished
Mon Nov 11 06:36:16 PM CST 2024
```

#### Test 3: 200 Parallel Client Connections

#### Configuration 3

- Number of Calls: 200
- File Transferred: `test/etc/words.txt`

#### Execution Time 3

- **Start Time:** Mon Nov 11 07:18:49 PM CST 2024
- **End Time:** Mon Nov 11 07:18:55 PM CST 2024
- **Total Duration:** 6 seconds

#### Terminal Input and Output 3

```console
[brod@avenger lab7]$ ./test/stress_test.sh 200 test/etc/words.txt
Doing run 0
Doing run 1
Doing run 2
Doing run 3
Doing run 4
Doing run 5
Doing run 6
Doing run 7
Doing run 8
Doing run 9
Doing run 10
Doing run 11
Doing run 12
Doing run 13
Doing run 14
Doing run 15
Doing run 16
Doing run 17
Doing run 18
Doing run 19
Doing run 20
Doing run 21
Doing run 22
Doing run 23
Doing run 24
Doing run 25
Doing run 26
Doing run 27
Doing run 28
Doing run 29
Doing run 30
Doing run 31
Doing run 32
Doing run 33
Doing run 34
Doing run 35
Doing run 36
Doing run 37
Doing run 38
Doing run 39
Doing run 40
Doing run 41
Doing run 42
Doing run 43
Doing run 44
Doing run 45
Doing run 46
Doing run 47
Doing run 48
Doing run 49
Doing run 50
Doing run 51
Doing run 52
Doing run 53
Doing run 54
Doing run 55
Doing run 56
Doing run 57
Doing run 58
Doing run 59
Doing run 60
Doing run 61
Doing run 62
Doing run 63
Doing run 64
Doing run 65
Doing run 66
Doing run 67
Doing run 68
Doing run 69
Doing run 70
Doing run 71
Doing run 72
Doing run 73
Doing run 74
Doing run 75
Doing run 76
Doing run 77
Doing run 78
Doing run 79
Doing run 80
Doing run 81
Doing run 82
Doing run 83
Doing run 84
Doing run 85
Doing run 86
Doing run 87
Doing run 88
Doing run 89
Doing run 90
Doing run 91
Doing run 92
Doing run 93
Doing run 94
Doing run 95
Doing run 96
Doing run 97
Doing run 98
Doing run 99
Doing run 100
Doing run 101
Doing run 102
Doing run 103
Doing run 104
Doing run 105
Doing run 106
Doing run 107
Doing run 108
Doing run 109
Doing run 110
Doing run 111
Doing run 112
Doing run 113
Doing run 114
Doing run 115
Doing run 116
Doing run 117
Doing run 118
Doing run 119
Doing run 120
Doing run 121
Doing run 122
Doing run 123
Doing run 124
Doing run 125
Doing run 126
Doing run 127
Doing run 128
Doing run 129
Doing run 130
Doing run 131
Doing run 132
Doing run 133
Doing run 134
Doing run 135
Doing run 136
Doing run 137
Doing run 138
Doing run 139
Doing run 140
Doing run 141
Doing run 142
Doing run 143
Doing run 144
Doing run 145
Doing run 146
Doing run 147
Doing run 148
Doing run 149
Doing run 150
Doing run 151
Doing run 152
Doing run 153
Doing run 154
Doing run 155
Doing run 156
Doing run 157
Doing run 158
Doing run 159
Doing run 160
Doing run 161
Doing run 162
Doing run 163
Doing run 164
Doing run 165
Doing run 166
Doing run 167
Doing run 168
Doing run 169
Doing run 170
Doing run 171
Doing run 172
Doing run 173
Doing run 174
Doing run 175
Doing run 176
Doing run 177
Doing run 178
Doing run 179
Doing run 180
Doing run 181
Doing run 182
Doing run 183
Doing run 184
Doing run 185
Doing run 186
Doing run 187
Doing run 188
Doing run 189
Doing run 190
Doing run 191
Doing run 192
Doing run 193
Doing run 194
Doing run 195
Doing run 196
Doing run 197
Doing run 198
Doing run 199
Now waiting for all the processes to terminate
Mon Nov 11 07:18:49 PM CST 2024
Done waiting; all processes are finished
Mon Nov 11 07:18:55 PM CST 2024
```

## Summary

- **Comparison of Single-threaded vs Multi-threaded:**

  - **Execution Time Difference:** The multi-threaded approach demonstrated efficient handling of multiple concurrent client connections, with execution times increasing linearly with the number of connections.
  - **Performance Impact:** The multi-threaded approach allowed the server to handle a higher number of concurrent connections without significant degradation in performance.
  - **Other Observations:** The server's performance under load was satisfactory, with all client processes completing within the expected time frame. The use of a thread pool helped manage resources efficiently, preventing the server from being overwhelmed by a large number of connections.

## Final Observations

- **Scalability:** The multi-threaded approach scales well with an increasing number of client connections, maintaining reasonable execution times even under high load.
- **Resource Management:** The use of a thread pool helps manage system resources efficiently, preventing the server from being overwhelmed by too many concurrent connections.
- **Potential Improvements:** Further optimization could be achieved by fine-tuning the thread pool size and exploring other concurrency models, such as asynchronous I/O, to improve performance under extreme load conditions.
- **Single-threaded Approach:** A single-threaded approach would likely struggle to handle multiple concurrent connections efficiently, leading to longer execution times and potential bottlenecks as each connection would be processed sequentially.

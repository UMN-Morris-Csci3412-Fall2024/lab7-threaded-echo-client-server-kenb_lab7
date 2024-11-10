#!/bin/bash

# Navigate to the root directory of the workspace
cd "$(dirname "$0")/.."

# Compile the Java files
cd src
javac echoserver/*.java

# Stop the server if it's already running
if [ -n "$(pgrep -f 'java -cp . echoserver.EchoServer')" ]; then
  pkill -f 'java -cp . echoserver.EchoServer'
  sleep 1
fi

# Start the server in a new terminal
gnome-terminal -- bash -c "cd $(pwd); java -cp . echoserver.EchoServer; exec bash" &
# Alternatively, you can use xterm
# xterm -hold -e "cd $(pwd); java -cp . echoserver.EchoServer" &
SERVER_PID=$!
trap "kill $SERVER_PID" EXIT
sleep 1

# Run the Bats tests
cd ..
bats test/*.bats
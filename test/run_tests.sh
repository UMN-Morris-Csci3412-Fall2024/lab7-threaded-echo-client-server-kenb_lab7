#!/bin/bash

# Navigate to the root directory of the workspace
cd "$(dirname "$0")/.."

# Compile the Java files
cd src
javac echoserver/*.java

# Stop the server if it's already running
if [ -f server.pid ]; then
  kill $(cat server.pid)
  rm server.pid
  sleep 1
fi

# Start the server in a new terminal
gnome-terminal -- bash -c "cd $(pwd); java -cp . echoserver.EchoServer; exec bash" &
# Alternatively, you can use xterm
# xterm -hold -e "cd $(pwd); java -cp . echoserver.EchoServer" &
echo $! > server.pid
sleep 1

# Run the Bats tests
cd ..
bats test/*.bats

# Stop the server
if [ -f src/server.pid ]; then
  kill $(cat src/server.pid)
  rm src/server.pid
fi
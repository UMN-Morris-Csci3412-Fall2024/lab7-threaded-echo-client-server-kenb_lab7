    #!/bin/bash

    numCalls=$1
    bigFile=$2

    for (( i=0; i<$numCalls; i++ ))
    do
        echo "Doing run $i"
        java echo.EchoClient < $bigFile > /dev/null &
    done
    echo "Now waiting for all the processes to terminate"
    # `date` will output the date *and time* so you can see how long
    # you had to wait for all the processes to finish.
    date
    wait
    echo "Done waiting; all processes are finished"
    date
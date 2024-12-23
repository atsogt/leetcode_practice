1. Initially, we append the root node to our queue.
2. We then enter a while loop that runs as long as our queue is not empty.
3. We print the level we are currently on.
4. We loop through the queue and remove nodes in the current level.
5. If the node has children, we append them to the queue from left to right.
6. After the current level is done, we increment the level by 1.
7. Our queue becomes empty once we have visited all of the nodes and the outer while loop will terminate.
// 225. Implement Stack using Queues
// https://leetcode.com/problems/implement-stack-using-queues/description/

class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }
    
    //The Main logic to push and pop are dependent on each other.
    // queues remove the first element... and since we are imitating stack, we take all the elements before the added element and place it at the back of the added element... therefore, when removing, it imitates stack data structure...

    // [1,2,3,4]
    // add 5
    // [1,2,3,4,5] -> [5,1,2,3,4]
    // pop
    // [5,1,2,3,4] -> [1,2,3,4] removes the last added element

    public void push(int x) {
        queue.add(x);
        for(int i = 1; i < queue.size(); i++) {
            queue.add(queue.remove());
        }
    }
    
    public int pop() {
        return queue.remove();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
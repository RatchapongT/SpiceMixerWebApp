class MyQueue {
    private Stack<Integer> input;
    private Stack<Integer> queue;

    public MyQueue() {
        input = new Stack<>();
        queue = new Stack<>();
    }

    // Push element x to the back of queue.
    public void push(int x) {
        input.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        peek();
        queue.pop();
    }

    // Get the front element.
    public int peek() {
        if (queue.empty()) {
            while (!input.empty()) {
                queue.push(input.pop());
            }
        }
        return queue.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return queue.empty() && input.empty();
    }
}
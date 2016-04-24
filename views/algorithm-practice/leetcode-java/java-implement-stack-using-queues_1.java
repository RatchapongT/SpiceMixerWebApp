class MyStack {
    private Queue<Integer> queue;
    private int top;
    public MyStack() {
        this.top = 0;
        this.queue = new  LinkedList<>();
    }
    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
        top = x;
    }

    // Removes the element on top of the stack.
    public void pop() {
        int size = queue.size();
        for(int i = 0; i < size - 1; i++) {
            top = queue.poll();
            queue.add(top);
        }
        queue.poll();
    }

    // Get the top element.
    public int top() {
        return top;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.size() == 0;
    }
}
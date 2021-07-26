import java.util.*;

class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;
    int size;

    /** Initialize your data structure here. */
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
        int size = 0;
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        input.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (output.isEmpty()) {
            if (input.isEmpty())
                return -1;
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }             return output.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (output.isEmpty()) {
            if (input.isEmpty())
                return -1;
            else {
                return input.get((0));
            }
        } else
            return output.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return output.isEmpty() && input.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj =
 * new MyQueue(); obj.push(x); int param_2 = obj.pop(); int param_3 =
 * obj.peek(); boolean param_4 = obj.empty();
 */
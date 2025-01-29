import java.util.Stack;

class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int element) {
        stack.push(element);
        if (minStack.isEmpty() || element <= minStack.peek()) minStack.push(element);
    }

    public void pop() {
        if (!stack.isEmpty() && stack.pop().equals(minStack.peek())) minStack.pop();
    }

    public int top() {
        return stack.isEmpty() ? -1 : stack.peek();
    }

    public int getMin() {
        return minStack.isEmpty() ? -1 : minStack.peek();
    }
}

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);
        System.out.println("Top: " + minStack.top());  // Output: 2
        System.out.println("Min: " + minStack.getMin());  // Output: 2
        minStack.pop();
        System.out.println("Min after pop: " + minStack.getMin());  // Output: 3
    }
}

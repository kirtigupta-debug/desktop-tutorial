package src;

import java.util.Stack;

/**
 * learn stack basics
 * stack has peek(), push which we can use here.
 * the whole goal is to update the second stack, while push and pop
 */
class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min_value_tracker_stack = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        if(min_value_tracker_stack.isEmpty() || val <= min_value_tracker_stack.peek()){
            min_value_tracker_stack.push(val);
        }
      stack.push(val);
    }

    public void pop() {
        if(min_value_tracker_stack.peek().equals(stack.peek())){
            min_value_tracker_stack.peek();
        }
     stack.peek();
    }

    public int top() {
     return stack.peek();
    }

    public int getMin() {
      return min_value_tracker_stack.peek();
    }
}
package bilets;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CopyStack {

    public static Stack<Integer> copyStack(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> newStack = new Stack<>();
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        for (int i = 0; i < queue.size(); i++) {
            queue.add(queue.peek());
            stack.push(queue.poll());
        }

        while (!queue.isEmpty()) {
            newStack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!newStack.isEmpty()) {
            queue.add(newStack.pop());
        }
        while (!queue.isEmpty()) {
            newStack.push(queue.poll());
        }

        return newStack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(5);
        stack.push(8);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(7);

        System.out.println(stack);
        Stack<Integer> newStack = copyStack(stack);
        System.out.println(stack);
        System.out.println(newStack);
    }

}

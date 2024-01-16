package bilets;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SplitStack {
    public static void splitStack(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        for (int i = 0; i < queue.size() + queue.size(); i++) {
            if (queue.peek() < 0) {
                stack.push(queue.poll());
            } else {
                queue.add(queue.poll());
            }
        }
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(-5);
        stack.push(3);
        stack.push(7);
        stack.push(-8);
        stack.push(15);
        stack.push(-3);
        stack.push(-22);
        System.out.println(stack);
        splitStack(stack);
        System.out.println(stack);
    }
}

package bilets;

import java.util.Stack;

public class Equals {
    public static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> helpStack = new Stack<>();
        boolean isEqual = true;
        if (stack1.size() != stack2.size()) {
            return false;
        }

        while (!stack1.isEmpty()) {
            if (stack1.peek() != stack2.peek()) {
                isEqual = false;
                helpStack.push(stack1.pop());
                helpStack.push(stack2.pop());
            } else {
                helpStack.push(stack1.pop());
                helpStack.push(stack2.pop());
            }
        }

        while (!helpStack.isEmpty()) {
            stack2.push(helpStack.pop());
            stack1.push(helpStack.pop());
        }
        return  isEqual;
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(4);
        stack1.push(3);
        stack1.push(5);
        stack1.push(7);
        stack1.push(9);
        stack1.push(1);

        stack2.push(4);
        stack2.push(3);
        stack2.push(5);
        stack2.push(7);
        stack2.push(9);
        stack2.push(1);

        System.out.println(stack1);
        System.out.println(stack2);

        System.out.println(equals(stack1,stack2));

        System.out.println(stack1);
        System.out.println(stack2);
    }
}

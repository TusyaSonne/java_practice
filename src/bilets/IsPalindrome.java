package bilets;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsPalindrome {
    public static boolean isPalindrome(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        int size = queue.size();
        for(int i = 0; i < size; i++) {
            int element = queue.remove();
            stack.push(element);
            queue.add(element);
        }

        for(int i = 0; i < size / 2; i++) {
            int front = queue.remove();
            int back = stack.pop();
            if (front != back) {
                for (int j = 0; j < i; j++) {
                    int temp = queue.remove();
                    queue.add(temp);
                }
                return false;
            }
            queue.add(front);
        }
        for (int i = 0; i < size; i++) {
            int element = queue.remove();
            queue.add(element);
        }
        return true;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(8);
        queue.add(17);
        queue.add(9);
        queue.add(17);
        queue.add(8);
        queue.add(3);
        System.out.println(queue);
        boolean isPalindromeDuh = isPalindrome(queue);
        System.out.println(isPalindromeDuh);
        System.out.println(queue);
    }
}

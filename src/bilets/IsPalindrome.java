package bilets;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsPalindrome {
    public static boolean isPalindrome(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        boolean isPalindrom = true;

        for (int i = 0; i < size; i++) {
            int temp = q.remove();
            q.add(temp);
            s.push(temp);
        }

        for (int i = 0; i < size; i++) {
            int temp = q.remove();
            if (temp != s.pop()) {
                isPalindrom = false;
            }
            q.add(temp);
        }

        return isPalindrom;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(8);
        queue.add(17);
        queue.add(9);
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

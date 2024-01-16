package bilets;

import java.util.LinkedList;

public class StackOnList<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T item) {
        list.addFirst(item);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return  list.removeFirst();
    }

    public int size() {
        return list.size();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return list.getFirst();
    }

    public static void main(String[] args) {
        StackOnList<Integer> stack = new StackOnList<>();

        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Вершина стека: " + stack.peek());
        System.out.println("Размер стека: " + stack.size());

        while (!stack.isEmpty()) {
            System.out.println("Извлечено: " + stack.pop());
        }
    }
}

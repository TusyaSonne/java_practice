package bilets;

import java.util.Arrays;

public class StackOnArray <T>{
    private static final int CAPACITY = 10;
    private Object[] array;
    private int size;

    public StackOnArray() {
        this.array = new Object[CAPACITY];
        this.size = 0;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public void push(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        T element = (T) array[--size];
        array[size] = null;
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        T element =(T) array[size - 1];
        return element;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        StackOnArray<Integer> stack = new StackOnArray<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Размер стека: " + stack.size());
        System.out.println("Вершина стека: " + stack.peek());

        System.out.println("Pop-нутый элемент: " + stack.pop());
        System.out.println("Pop-нутый элемент: " + stack.pop());
        System.out.println("Пустой ли стек? " + stack.isEmpty());
        System.out.println("Pop-нутый элемент: " + stack.pop());
        System.out.println("Пустой ли стек? " + stack.isEmpty());
    }
}

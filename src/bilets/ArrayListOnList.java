package bilets;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListOnList<T> extends AbstractList<T> { //предоставление базового набора методов для списка

    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T element) {
            this.data = element;
            this.next = null;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public boolean add(T element) {
        if (head == null) {
            head = new Node<>(element);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(element);
        }
        size++;
        return true;
    }

    public static void main(String[] args) {
        ArrayListOnList<String> arrayList = new ArrayListOnList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");

        System.out.println("Элементы ArrayList: ");
        for (String element : arrayList) {
            System.out.println(element);
        }

        int index = 1;
        System.out.println("Элемент по индексу: " + index + ": " + arrayList.get(index));
        System.out.println("Размер ArrayList: " + arrayList.size());
    }
}

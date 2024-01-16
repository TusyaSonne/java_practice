package bilets;

import java.util.Arrays;

public class ArrayListOnArray<T> {
    public static final int CAPACITY = 10;

    private Object[] array;
    private int size;

    public ArrayListOnArray() {
        array = new Object[CAPACITY];
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public void add(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArrayListOnArray<String> arrayList = new ArrayListOnArray<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");

        System.out.println("Элементы массива: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        System.out.println("Размер массива: " + arrayList.size());
        System.out.println(arrayList.get(2));
    }
}

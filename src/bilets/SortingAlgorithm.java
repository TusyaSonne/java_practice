package bilets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortingAlgorithm<T extends Number> implements Comparator<T> {

    @Override
    public int compare(T a, T b) {
        return Double.compare(a.doubleValue(), b.doubleValue());
    }

    public void bubbleSort(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compare(array[j], array[j+1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private int partition(T[] array, int low, int high) {
        T pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(array[j], pivot) <= 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, high);
        return (i + 1);
    }

    public void quickSort(T[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        SortingAlgorithm<Integer> integerSorter = new SortingAlgorithm<>();
        Integer[] intArray = {5,4,3,2,1};

        System.out.println(Arrays.toString(intArray));
        integerSorter.bubbleSort(intArray);
        System.out.println("Массив после сортировки пузырьком: " + Arrays.toString(intArray));

        SortingAlgorithm<Double> doubleSorter = new SortingAlgorithm<>();
        Double[] doubleArray = {5.6, 4.5, 3.6, 2.2, 1.1};

        System.out.println(Arrays.toString(doubleArray));
        doubleSorter.quickSort(doubleArray, 0, doubleArray.length - 1);
        System.out.println("Массив после быстрой сортировки: " + Arrays.toString(doubleArray));

        SortingAlgorithm<Long> longSorter = new SortingAlgorithm<>();
        Long[] longArray = {5L, 4L, 3L, 2L, 1L};

        System.out.println(Arrays.toString(longArray));
        longSorter.quickSort(longArray, 0, longArray.length - 1);
        System.out.println("Массив после быстрой сортировки: " + Arrays.toString(longArray));
    }
}

package bilets;

public class SearchAlgorithm<T extends Comparable<T>> {
    private T[] array;

    public SearchAlgorithm(T[] array) {
        this.array = array;
    }

    public int linearSearch(T key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(T key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = array[mid].compareTo(key);

            if (comparison == 0) {
                return mid;
            }
            if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,8,9};
        SearchAlgorithm<Integer> integerSearch = new SearchAlgorithm<>(intArray);

        int key = 5;
        int linearResult = integerSearch.linearSearch(key);
        int binaryResult = integerSearch.binarySearch(key);

        System.out.println(linearResult);
        System.out.println(binaryResult);
    }
}

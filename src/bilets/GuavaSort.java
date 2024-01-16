package bilets;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class GuavaSort {
    public static void main(String[] args) {
        String[] arr = {"Farm", "Zoo", "Car", "Apple", "Bee", "Golf", "Bee", "Dog", "Golf", "Zoo", "Zoo", "Bee", "Bee", "Apple"};
        System.out.println(Arrays.toString(guavaSort(arr)));
    }

    public static String[] guavaSort(String[] arr) {
        TreeMap<String, Integer> stringCountMap = new TreeMap<String, Integer>();
        for (String s : arr) {
            if (stringCountMap.containsKey(s)) {
                stringCountMap.put(s, stringCountMap.get(s) + 1);
            } else {
                stringCountMap.put(s, 1);
            }
        }
        TreeSet<String> sortedSet = new TreeSet<String>(stringCountMap.keySet()); //создание TreeSet из ключей TreeMap
        String[] sortedArr = new String[arr.length];
        int i = 0;
        for (String s : sortedSet) {
            for (int j = 0; j < stringCountMap.get(s); j++) {
                sortedArr[i] = s;
                i++;
            }
        }
        return sortedArr;
    }
}

package bilets;

import java.util.ArrayList;
import java.util.List;

public class Alternate {
    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();

        int index1 = 0;
        int index2 = 0;
        while (index1 < list1.size() && index2 < list2.size()) {
            result.add(list1.get(index1));
            result.add(list2.get(index2));
            index1++;
            index2++;
        }

        while (index1 < list1.size()) {
            result.add(list1.get(index1));
            index1++;
        }

        while (index2 < list2.size()) {
            result.add(list2.get(index2));
            index2++;
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> list2 = List.of(6,7,8,9,10,11,12);
        List<Integer> resultedList = alternate(list1,list2);
        System.out.println(resultedList);
    }
}

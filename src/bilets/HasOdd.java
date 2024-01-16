package bilets;

import java.util.HashSet;
import java.util.Set;

public class HasOdd {
    public static boolean hasOdd(Set<Integer> set) {

        if (set.isEmpty()) {
            return false;
        }

        for (int value : set) {
            if (value % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(0,2,4,5,6,8,10);
        Set<Integer> set2 = Set.of(4,8,16,24,32);
        System.out.println(hasOdd(set1));
        System.out.println(hasOdd(set2));

        Set<Integer> set3 = new HashSet<>();
        System.out.println(hasOdd(set3));
    }
}

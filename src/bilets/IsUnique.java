package bilets;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {
    public static boolean isUnique(Map<String,String> map) {
        Map<String,Integer> valueMap = new HashMap<>();

        for(Map.Entry<String,String> entry : map.entrySet()) {
            valueMap.put(entry.getValue(), valueMap.getOrDefault(entry.getValue(), 0) + 1);
        }

        for (int count : valueMap.values()) {
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Map<String,String> map1 = new HashMap<>();
        map1.put("Marty","Stepp");
        map1.put("Stuart","Reges");
        map1.put("Jessica","Miller");
        map1.put("Amanda","Camp");
        map1.put("Hal","Perkins");
        boolean isMap1Unique = isUnique(map1);
        System.out.println(isMap1Unique);

        Map<String,String> map2 = new HashMap<>();
        map2.put("Kendrick","Perkins");
        map2.put("Stuart","Reges");
        map2.put("Jessica","Miller");
        map2.put("Bruce","Reges");
        map2.put("Hal","Perkins");
        boolean isMap2Unique = isUnique(map2);
        System.out.println(isMap2Unique);

        System.out.println();
        Map<String,String> map3 = Map.of("i", "ii", "b", "bb", "c", "cc", "dd", "cc");
        Map<String,String> map4 = Map.of("i", "ii", "b", "bb", "c", "cc", "d", "dd");
        boolean isTrue = isUnique(map3);
        boolean isTrue2 = isUnique(map4);
        System.out.println(isTrue);
        System.out.println(isTrue2);


        Map<String,String> emptyMap = new HashMap<>();
        boolean isEmptyTrue = isUnique(emptyMap);
        System.out.println(isEmptyTrue);

    }
}

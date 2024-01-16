package bilets;

import java.util.HashMap;
import java.util.Map;

public class Rarest {
    public static int rarest(Map<String,Integer> map) throws Exception {

        if (map.isEmpty()) {
            throw new Exception("Map пустой");
        }

        Map<Integer,Integer> valueMap = new HashMap<>();

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            valueMap.put(entry.getValue(), valueMap.getOrDefault(entry.getValue(), 0) + 1);
        }

        int count = 10000;
        int value = 0;
        for (Map.Entry<Integer, Integer> entry : valueMap.entrySet()) {
            if (entry.getValue() < count) {
                count = entry.getValue();
                value = entry.getKey();
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Ally", 20);
        map.put("Victor", 17);
        map.put("Billy", 21);
        map.put("William", 20);
        map.put("Roger", 21);
        map.put("Bob", 22);
        map.put("Robert", 22);
        map.put("Stanley", 20);
        map.put("Jack", 17);
        map.put("Alan", 15); //самое редкое
        map.put("Bettie", 17);
        try {
            System.out.println(rarest(map));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

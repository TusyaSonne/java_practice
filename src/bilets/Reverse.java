package bilets;

import java.util.HashMap;
import java.util.Map;

public class Reverse {
    public static Map<String,Integer> reverse(Map<Integer,String> map) {

        Map<String,Integer> reveseMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            reveseMap.put(entry.getValue(), entry.getKey());
        }
        return reveseMap;
    }

    public static void main(String[] args) {
        Map<Integer,String> map = Map.of(1, "one", 2, "two", 3, "three", 4, "four", 5, "five");
        System.out.println(map);
        Map<String,Integer> reverseMap = reverse(map);
        System.out.println(reverseMap);
    }
}

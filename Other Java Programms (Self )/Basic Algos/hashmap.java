import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Carrot", 125);
        map.put("Pea", 90);
        map.put("Apple", 120);
        map.put("Mango", 135);
        map.put("Orange", 60);
        System.out.println(map);
        if (map.containsKey("Apple")) {
            System.out.println("Present");
        }
        System.out.println(map.containsKey("Apple"));
        System.out.println(map.containsKey("Pea"));
        System.out.println(map.get("Pea"));
        System.out.println(map.get("Apple"));
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}

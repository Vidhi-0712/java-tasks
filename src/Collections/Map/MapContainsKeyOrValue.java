package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapContainsKeyOrValue {
    public static void main(String[] args) {
        Map<Integer,String> names = new HashMap<>();
        names.put(101,"John");
        names.put(102,"David");
        names.put(103,"Mike");

        System.out.println("Key Exists: "+names.containsKey(102));
        System.out.println("Value Exists: "+names.containsValue("David"));
    }
}

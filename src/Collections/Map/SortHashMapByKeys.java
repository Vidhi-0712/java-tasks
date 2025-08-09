package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByKeys {
    public static void main(String[] args) {
        Map<Integer,String> fruits = new TreeMap<>();
        fruits.put(3,"Banana");
        fruits.put(1,"Apple");
        fruits.put(2,"Cherry");

        System.out.println(fruits);
    }
}

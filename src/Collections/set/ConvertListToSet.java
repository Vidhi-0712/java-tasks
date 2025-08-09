package Collections.set;

import java.util.*;

public class ConvertListToSet {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("apple","banana","apple","orange"));
        Set<String> unique = new HashSet<>(fruits);

        System.out.println(unique);
    }
}

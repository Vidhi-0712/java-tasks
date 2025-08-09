package Collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveAllElements {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1,2,3,4));
        numbers.removeAll(numbers);
        System.out.println(numbers);
    }
}

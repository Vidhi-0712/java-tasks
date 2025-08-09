package Collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EnterElements {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,2,3,2,3,4,5,6,5,4);
        Set<Integer> zzz = new HashSet<>(arr);
        System.out.println(zzz);

        Set<String> cars = new HashSet<>();
        cars.add("Mecedes");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Jaguar");
        cars.add("Rolls Royes");

        System.out.println(cars);
        System.out.println(cars.contains("i10"));
    }
}

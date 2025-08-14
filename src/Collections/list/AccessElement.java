package Collections.list;

import java.util.ArrayList;

public class AccessElement {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(9.0);
        numbers.add(8.0);
        numbers.add(5.0);
        numbers.add(4.0);

        System.out.println(numbers.get(2));
        System.out.println("changes");

    }
}

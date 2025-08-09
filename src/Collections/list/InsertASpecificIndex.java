package Collections.list;

import java.util.ArrayList;

public class InsertASpecificIndex {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);

        numbers.add(2, 3);

        System.out.println(numbers);
        ArrayList<Integer> temp=new ArrayList<>();
        for (int i = numbers.size()-1; i>=0; i--) {
                temp.add(numbers.get(i));
        }

        System.out.println(temp);
    }
}

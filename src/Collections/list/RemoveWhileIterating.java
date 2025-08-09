package Collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveWhileIterating {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        Iterator<Integer> it = numbers.iterator();
            while (it.hasNext()) {
                Integer num = it.next();
                if (num % 2 != 0) {
                    it.remove();
                } else {
                    System.out.println(num);
                }
            }
    }

}

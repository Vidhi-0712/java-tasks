package Collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(10,20,30,40));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(30,40,50,60));

        set1.retainAll(set2);
        System.out.println("The Intersection of Two Sets :"+set1);
    }
}

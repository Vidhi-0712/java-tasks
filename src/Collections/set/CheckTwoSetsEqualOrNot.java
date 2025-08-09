package Collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckTwoSetsEqualOrNot {
    public static void main(String[] args) {
        Set<Character> set1 = new HashSet<>(Arrays.asList('A','B','C'));
        Set<Character> set2 = new HashSet<>(Arrays.asList('C','B','A'));

        if(set1.equals(set2)){
            System.out.println("Sets are equal: true");
        }else {
            System.out.println("Sets are equal: false");
        }
    }
}

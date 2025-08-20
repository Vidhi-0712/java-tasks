package DSA;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Iterate over a HashMap using for-each and entrySet()
public class DP_38 {
    public static void main(String[] args) {
        HashMap<Integer,String> tv = new HashMap<>(Map.of(
                1,"Samsung",
                2,"MI",
                3,"Onida",
                4,"Sony"
        ));

        for(Map.Entry<Integer,String> me : tv.entrySet()){
            System.out.println(me);
        }
    }
}

package DSA;
import java.util.HashMap;

//Create a HashMap and insert, retrieve, and remove key-value pairs
public class DP_37 {
    public static void main(String[] args) {
        HashMap<Integer,String> h = new HashMap<>();
        h.put(1,"apple");
        h.put(2,"Grapes");
        h.put(3,"Orange");

        System.out.println(h.get(1));
        System.out.println(h.get(2));
        System.out.println(h.get(3));

       h.remove(3);
        System.out.println(h.get(1));
        System.out.println(h.get(2));
    }
}

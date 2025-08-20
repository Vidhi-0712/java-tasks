package DSA;
import java.lang.StringBuilder;
import java.lang.String;

public class IQ_1 {
    public static void main(String[] args) {
        String a = "Vidhisha";
        int ptr = a.length()-1;
        StringBuilder n = new StringBuilder();

        for(int i=0; i<a.length(); i++){
            n.append(a.charAt(ptr));
            ptr--;
        }
        System.out.println(n.toString());
    }
}

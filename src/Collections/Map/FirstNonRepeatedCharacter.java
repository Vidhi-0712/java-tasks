package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "swiss";

        Map<Character,Integer> freq = new HashMap<>();

        for(char c: input.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        System.out.println(freq);

        for(char c : input.toCharArray()){
            if(freq.get(c)==1) {
                System.out.println("First non-repeating character is :"+c);
                return;
            }
        }





    }
}

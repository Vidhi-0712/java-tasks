package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class CheckTwoStringsAnagrams {
    public static void main(String[] args) {
        //for string "listen"
        Map<Character,Integer> string1 = new HashMap<>();
        String input1 = "listen";

        for(char c: input1.toCharArray()){
            if(c==' ') continue;
            string1.put(c,string1.getOrDefault(c,0)+1);
        }
        System.out.println("Frequencies in String Listen: "+string1);

        //for String "silent"
        Map<Character,Integer> string2 = new HashMap<>();
        String input2 = "silent";

        for(char c: input2.toCharArray()){
            if(c==' ') continue;
            string2.put(c,string2.getOrDefault(c,0)+1);
        }
        System.out.println("Frequencies in String silent: "+string2);

        //check if equals
        if(string1.equals(string2)){
            System.out.println("Strings are anagram");
        }else {
            System.out.println("Strings are not anagram");
        }
    }
}

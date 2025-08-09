package Collections.Map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Arrays;

public class CountCharacterFrequenciesInString {
    public static void main(String[] args) {


    Map<Character,Integer> charcount = new HashMap<>();
    String input = "programming";
    input = input.toLowerCase();

    for(char c: input.toCharArray()){
        if(c==' ') continue;
        charcount.put(c,charcount.getOrDefault(c,0)+1);
    }

    for(Map.Entry<Character,Integer> entry: charcount.entrySet()){
        System.out.println(entry.getKey()+":"+entry.getValue());
    }
    }
}


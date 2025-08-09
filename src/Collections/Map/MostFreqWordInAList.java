package Collections.Map;

import java.util.*;

public class MostFreqWordInAList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("apple","banana","apple","orange","banana","apple"));

        String mostfreq = null;
        int maxcount = 0;
        Map<String,Integer> freq = new HashMap<>();

        for(String f : fruits){
            int count = freq.getOrDefault(f,0)+1;
            freq.put(f,count);

            if(count>maxcount){
                maxcount=count;
                mostfreq=f;
            }
        }
        System.out.println("Most Frequences: "+freq);
        System.out.println("Most Frequent Word:"+mostfreq+"("+maxcount+" times)");
    }
}

package LeetCode_Solutions;

import java.util.Arrays;

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {

        // This code only compares two elements in the array of string

      /*  // strs[0] = flower;
        // strs[1]= flow;
        // strs[2]= flight;
        String a;
        String b;
        char ch;
        StringBuilder store = new StringBuilder();

        // name.charAt(number) ,,, array.lenght,,, for(two array values compare with i and j,,, if else)
        if (strs.length != 0) {
            a = strs[0];

            for (int i = 0; i < strs.length - 1; i++) {
                b = strs[i];
                store.setLength(0);
                int minlength = Math.min((a.length()), b.length());
                for (int j = 0; j < minlength; j++) {
                    if (a.charAt(j) == b.charAt(j)) {
                        store.append(a.charAt(j));
                    } else {
                        break;
                    }
                }
                a = store.toString();
                if (a.isEmpty()) {
                    break;
                }
            }
            if (store.length() > 0) {
                System.out.println("The longest common prefix is " + store.toString());
            } else {
                System.out.println("There is no common prefix among the string");
            }
        } else {
            System.out.println("String array is empty");
        }
        return store.toString();
    }

    public static void main(String[] args) {
        LeetCode_Solutions.Solution14 s = new LeetCode_Solutions.Solution14();
        String[] strs = {"flower", "flow", "flight"};
        s.longestCommonPrefix(strs);
    }*/

        // this is the correct code which compares all the elements:

        StringBuilder prefix = new StringBuilder();
        Arrays.sort(strs);

        char[] firstElement = strs[0].toCharArray();
        char[] lastElement = strs[strs.length-1].toCharArray();

        for(int i =0; i< firstElement.length; i++){
            if(firstElement[i] != lastElement[i]) {
                break;
            }
            prefix.append(firstElement[i]);
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        Solution14 s = new Solution14();
        String[] strs = {"flower", "flow", "flight"};
       System.out.println(s.longestCommonPrefix(strs));
    }
}






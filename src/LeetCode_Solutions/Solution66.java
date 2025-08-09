package LeetCode_Solutions;

import java.util.Arrays;

public class Solution66 {
    public static void main(String[] args) {
        int [] digits = {9};
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
              //  return digits;
            }
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        System.out.println(Arrays.toString(digits));
       // return digits;












     //   my approach:

//        int[] digit = {9};
//                     // output = [1,2,1,0]
//
//        for(int i =0; i<digit.length; i++){
//
//            if(digit[i]==9){
//                if(digit.length == 0){
//                    int[] newarr = Arrays.copyOf(digit,digit.length+1);
//                }
//                digit[digit.length-1] =0;
//                digit[digit.length-2]=digit[digit.length-2]+1;
//            } else if (i==digit.length-1){
//                int lastElement = digit[digit.length-1] +1;
//                digit[digit.length-1] = lastElement;
//            }
//        }
//        System.out.println(Arrays.toString(digit));




    }
}

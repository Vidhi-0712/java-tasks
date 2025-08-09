package Oops;

public class MinValue {
    public static void main(String[] args) {
        int [] arr = {1, 9, -4, 90};
        int min= arr[0];

        for(int e: arr){
            if(e<min){
                min=e;
            }
        }
        System.out.println(min);
    }
}

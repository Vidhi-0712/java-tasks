package Oops;

import java.util.Scanner;

public class IntegerPresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an integer:");
        int integer = sc.nextInt();

        int [] arr = {1,2,3,4,5};
        boolean found = false;


        for (int i=0; i<= arr.length-1; i++) {
            if (arr[i] == integer) {
                found = true;
                break;
            }

        }
            if(found){
                System.out.printf("%d is present in the array", integer);
            } else{
                System.out.printf("%d is not present in the array",integer);
            }


    }
}

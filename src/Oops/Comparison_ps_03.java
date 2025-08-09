package Oops;

import java.util.Scanner;

public class Comparison_ps_03 {
    public static void main(String[] args) {
        int x = 45;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();

        if(x>a){
            System.out.println("The given number is less than "+x);
        } else {
            System.out.println("The given number is greater than "+x);
        }




    }
}

package Oops;

import java.util.Scanner;

public class FactorialUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its Factorial :");
        int n = sc.nextInt();
        int Fact = 1;

        for(int i=1; i<=n; i++){
            Fact = Fact * i;
        }
        System.out.println(Fact);
    }
}

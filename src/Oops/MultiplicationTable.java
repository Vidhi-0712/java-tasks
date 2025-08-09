package Oops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n :");
        int n = sc.nextInt();


        int sum=0;

        for(int i=1; i<=10 ;i++){
            sum = n * i;
            System.out.printf("%d X %d = %d\n",n,i,sum);
        }
    }
}

package Oops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Natural Number : ");
        int n = sc.nextInt();
        int i = 1;

        do{
            System.out.println(i);
            i++;

        } while(i<=n);


    }
}

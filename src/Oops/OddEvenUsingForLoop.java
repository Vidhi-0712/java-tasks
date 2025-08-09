package Oops;

import java.util.Scanner;

public class OddEvenUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(2 * i + 1);
        }
    }
}


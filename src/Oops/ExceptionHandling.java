package Oops;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            int[] arr = {1, 2, 3, 4, 5, 6};

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to access the array");
            int input = sc.nextInt();
            System.out.println(arr[input]);
        }
        catch(Exception e) {

            for (int attempt = 0; attempt <= 5; attempt++) {
                if (attempt > 5) {
                    System.out.println("Error");
                }
            }
        }


        }



    }

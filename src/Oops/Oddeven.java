package Oops;

import java.util.Scanner;

class Oddeven {

    // Method to check if a number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Call the method to check if the number is even or odd
        String result = checkEvenOrOdd(num);

        System.out.println("The number " + num + " is " + result + ".");

        scanner.close();
    }
}
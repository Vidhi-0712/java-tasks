package Oops;

import java.util.Scanner;


public class Percentage {
    public static void main(String[] args) {

        Scanner s1=new Scanner(System.in);

        System.out.println("Enter the marks for maths");
        int maths = s1.nextInt();

        System.out.println("Enter the marks for english");
        int english = s1.nextInt();

        System.out.println("Enter the marks for hindi");
        int hindi = s1.nextInt();

        System.out.println("Enter the marks for bio");
        int bio = s1.nextInt();

        System.out.println("Enter the marks for sci");
        int sci = s1.nextInt();

        System.out.println("The total of five subjects is :");
        int sum = maths+hindi+english+bio+sci;
        System.out.println(sum);

        System.out.println("The percentage is :");
        float per = sum/500f;
        float percentage = per*100f;
        System.out.println(percentage);

    }

}

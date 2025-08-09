package Oops;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner M1 = new Scanner(System.in);
        System.out.println("Enter Marks for Maths :");
        double Maths = M1.nextDouble();

        System.out.println("Enter marks for english :");
        double English = M1.nextDouble();

        System.out.println("Enter marks for hindi :");
        double Hindi = M1.nextDouble();

        double TotalMarks = 300;

        double obtainedMarks = Maths + English + Hindi;
        System.out.println(obtainedMarks);

        double Percentage = (obtainedMarks/TotalMarks) * 100;
        System.out.println(Percentage);

        if(Maths >= 33 && English >= 33 && Hindi >=33 && Percentage >= 40) {
            System.out.println("Congratulations! You are Pass");
        } else {
            System.out.println("Sorry! You are Fail");
        }

    }
}

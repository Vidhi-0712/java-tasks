package Practice.Oops;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a number from 0 1 2  :");
        int user = sc.nextInt();

        Random r = new Random();
        int computer = r.nextInt(2);
        System.out.println(computer);

        if (computer == 0 && user == 0) {
            System.out.println("Tie");
        } else if (computer == 0 && user == 1) {
            System.out.println("Paper won : you won");
        } else if (computer == 0 && user == 2) {
            System.out.println("Rock won : you lost");
        } else if (computer == 1 && user == 0) {
            System.out.println("Paper won : you lost");
        } else if (computer == 1 && user == 1) {
            System.out.println("tie");
        } else if (computer == 1 && user == 2) {
            System.out.println("scissor won : you won");
        } else if (computer == 2 && user == 0) {
            System.out.println("rock won : you won");
        } else if (computer == 2 && user == 1) {
            System.out.println("scissor won : you lost");
        } else if (computer == 2 && user == 2) {
            System.out.println("tie");
        }

    }
}


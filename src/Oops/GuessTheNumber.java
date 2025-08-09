package Oops;

import java.util.Random;
import java.util.Scanner;

class Game{
    int number;
    int userInput;
    int attempts;

    Game(){
      Random r = new Random();
      number = r.nextInt(100)+1;
      attempts =0;
    }

    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 1 & 100");
        userInput = sc.nextInt();
        attempts++;
    }
    boolean isCorrectNumber(){
        return number==userInput;
    }
    void giveHint(){
        if(userInput>number){
            System.out.println("Your Guess is too high!");
        }else{
            System.out.println("Your Guess is too low!");
        }
    }
    int getAttempts(){
        return attempts;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game g1 = new Game();
        boolean won = false;

        while(!won){
            g1.takeUserInput();
            won = g1.isCorrectNumber();

            if(won) {
                System.out.println("🎉 Congratulations! You guessed the correct number.");
                 System.out.println("📊 Total attempts: " + g1.getAttempts());
        } else {
            g1.giveHint();
        }
    }
        }

    }


package Oops;

import java.util.Scanner;


public class IncomeTaxSlab {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the slab you are under");
        double IncomeSlab = sc.nextDouble();

        if(IncomeSlab >= 2.5 && IncomeSlab <= 5){
            System.out.println("You Paid 5% income tax");

        } else { if (IncomeSlab >= 5 && IncomeSlab <= 10) {
            System.out.println("You Paid 20% income tax");

            } else { if (IncomeSlab >= 10) {
                    System.out.println("You paid 30% Income tax");

                 }
             }
            }

        }
    }


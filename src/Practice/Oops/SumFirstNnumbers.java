package Practice.Oops;

import java.util.Scanner;

public class SumFirstNnumbers {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for n :");
        int n = sc.nextInt();

        int sum=0;
        int i=0;

        while(i<n){
           sum = sum + (2*i);
            i++;
        }
        System.out.print(sum);
    }

}

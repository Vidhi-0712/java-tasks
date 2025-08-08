package Practice.Oops;

import java.util.Scanner;

public class ReverseForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number :");
        int n = sc.nextInt();

        for(int i = n; i != 0; i--){
            System.out.println(i);
        }
    }
}

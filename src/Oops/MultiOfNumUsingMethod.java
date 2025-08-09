package Oops;

public class MultiOfNumUsingMethod {
    public static void main(String[] args) {
        int n=8;
        System.out.println("The Multiplication Table of "+n+"is"+multi(n));

    }
    static int multi(int a){
        int sum=0;
        for(int i=1; i<=10; i++){
            sum=a*i;
            System.out.printf("%d X %d = %d",a,i,sum);
            System.out.println("\n");
        }
        return sum;
    }

}





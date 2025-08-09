package Oops;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n=3;

        if(n%1==0 && n%n==0){
            System.out.println("Prime number");
        }else{
            System.out.println("not PRIme");
        }
    }
}

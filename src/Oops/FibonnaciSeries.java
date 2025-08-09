package Oops;

public class FibonnaciSeries {
    public static void main(String[] args) {
        int n=5;
        System.out.println("The fibonacci of given number is :"+Fib(n));

    }
   public static int Fib(int x){
        int sum=0;
        for(int i=0; i<=x; i++){
            sum=sum+(i+1);
            System.out.print(" "+sum);
        }
        return sum;

    }
}

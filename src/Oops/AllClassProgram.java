package Oops;

public class AllClassProgram {
    public static void main(String[] args) {

        //program 1:
    //    Multitable obj1= new Multitable();
        //   obj1.multi(8);

        // program 2:
     //   EvenOddChecker obj2= new EvenOddChecker();
      //  obj2.EvenOdd(3);

        //program 3:
     //   PalindromeChecker obj3= new PalindromeChecker();
     //   obj3.Palindrome(121);

        //program 4:
      //  FactorialCalculator obj4 = new FactorialCalculator();
      //  System.out.println("The Factorial of a given Number is :"+obj4.factorial(5));

        //program 5:
     //   PrimeChecker obj5 = new PrimeChecker();
      //  obj5.Prime(7);

        // program 6:
      //  FibonacciSeries obj6 = new FibonacciSeries();
      //  obj6.fib(5);

        //program 7:
      //  ArmStrongChecker obj7 = new ArmStrongChecker();
      //  obj7.arm(153);

        //program 8:
      //  PatternPrinter obj8 = new PatternPrinter();
       // obj8.Pattern(5);

        //program 9:
      //  LargestOfThree obj9 = new LargestOfThree();
       // obj9.large(4, 3,5);

        //program 10:
     //   NumberSwapper obj10 = new NumberSwapper();
      //  obj10.Swapper(2,4);

        //Program 11:
    //   ArraySumCalculator obj11 = new ArraySumCalculator();
     //  int[] arr = {1,2,3,4,5};
    //   obj11.Practice.Oops.ArraySum(arr);

        //Program 12:
      //  ReverseNumber obj12 = new ReverseNumber();
      //  int result = obj12.reversed( 1234);
      //  System.out.println("The reverse of "+ obj12.reversed(1234)+"given number is :"+result);

        //Program 13;
      //  SumOfDigits obj13 = new SumOfDigits();
      //  int input = 1546;
       // System.out.println("The Practice.Oops.Sum of digits of "+input+"is :"+obj13.total(input));

        //Program 14:
      //  CountEvenOddInRange obj14 = new CountEvenOddInRange();
      //  int inputRange = 13;
     //   System.out.println("The count of Even Numbers in range:"+inputRange+ "is :" +obj14.evenNum(inputRange));
      //  System.out.println("The count of Odd Numbers in range:"+inputRange+ "is :" +obj14.oddNum(inputRange));

        //Program 15:
        PerfectNumChecker obj15 = new PerfectNumChecker();
        obj15.perfectNum(6);
    }
}

/* program 1:
class Multitable extends Practice.Oops.AllClassProgram{
    int multi(int a){
        int sum=0;
        for(int i=1; i<=10; i++) {
            sum = a * i;
            System.out.printf("%d X %d = %d", a, i, sum);
            System.out.println("\n");
        }
        return sum;

    }
}*/

/* program 2:
class EvenOddChecker extends Practice.Oops.AllClassProgram{
    void EvenOdd(int a){
        if(a%2==0){
            System.out.printf("%d is even number",a);
        }else{
            System.out.printf("%d is odd number",a);
        }
    }
}*/

// program 3
/*
class PalindromeChecker extends Practice.Oops.AllClassProgram{
    void Palindrome(int org){

        int store=0;

        for(int i=0; i<=org; i++){
            if(org%10 != 0){
                store= org%10;
            }
            store= store/10;
        }
        if(org==store){
            System.out.printf("%d is palindrome",org);
        }else{
            System.out.printf("%d is not palindrome",org);
        }*/

// Program 4:
/*
class FactorialCalculator extends Practice.Oops.AllClassProgram{
    int factorial(int a){
        int fact=1;
        for(int i=1; i<=a;i++){
            fact = fact * i;
        }
        return fact;*/

// Program 5:
/*class PrimeChecker extends Practice.Oops.AllClassProgram{
    void Prime(int a){
        if(a%2!=0 && a%(a/2)!=0){
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime ");
        }
*/

//Program 6:
/*class FibonacciSeries extends Practice.Oops.AllClassProgram{
    int fib (int a){
        int sum=0;
        for(int i=1; i<=a; i++){
            sum = sum + i;
            System.out.print(sum);
            System.out.print(" ");
        }
        return (sum);
*/

//Program 7:
/*
class ArmStrongChecker extends Practice.Oops.AllClassProgram {
    void arm(int a) {
        int count = 3;
        int store = 0;
        double pow = 0;
        double sum = 0;

        for (int i = 0; i <= 0; i++) {
            if ((i % 10) != 0) {
                store = a % 10;
                pow = Math.pow(store, count);
                sum = pow;
            }

            if (sum == a) {
                System.out.println("The number is Armstrong");
            } else {
                System.out.println("The number is not Armstrong");
            }
        }*/

//Program 8:
/*class PatternPrinter extends Practice.Oops.AllClassProgram{
    void Pattern (int a){
        for(int i=1; i<=a; i++){
            for(int j=5; j>=i; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        } */

//Program 9:
/*class LargestOfThree extends Practice.Oops.AllClassProgram{
    void large (int a, int b, int c){
        if(a>b && a>c){
            System.out.printf("%d is largest",a);
        } else if (b>a && b>c){
            System.out.printf("%d is largest",b);
        } else {
            System.out.printf("%d is largest",c);
        } */

//Program 10:
/*class NumberSwapper extends Practice.Oops.AllClassProgram{
    void Swapper(int a, int b){
        int temp=0;
        System.out.printf("Before Swapping a is %d and b is %d",a,b);
        System.out.println("\n");

        temp=a;
        a=b;
        b=temp;

        System.out.printf("After Swapping a is %d and b is %d",a,b);

 */

// Program 11:
/*
class ArraySumCalculator extends Practice.Oops.AllClassProgram{
    void Practice.Oops.ArraySum(int[] a){
        int add=0;
        for(int i=0; i<a.length; i++){
            add=add + a[i];
        }
        System.out.println(add);*/

//Program 12:
/*
class ReverseNumber extends Practice.Oops.AllClassProgram{
    int reversed(int a){
    int digit=0;
    int reverse=0;

    while(a !=0){
        digit = a%10;
        reverse = reverse * 10 + digit;
        a = a/10;;
        }
    return (reverse); */

//Program 13:
/*
class SumOfDigits extends Practice.Oops.AllClassProgram{
    int total(int a){
        int sum=0;
        int digit=0;

        while(a !=0){
            digit=a%10;
            sum=sum+digit;
            a = a /10;
        }
        return (sum); */

//Program 14:
/*
class CountEvenOddInRange extends Practice.Oops.AllClassProgram{
    int countOdd = 0;
    int countEven=0;

    int evenNum (int a){
        for(int i=0; i<=a; i++){
            if(i%2==0){
                countEven = countEven + 1;
            }
        }
        return (countEven);
    }
    int oddNum (int a){
        for(int j=0; j<=a; j++){
            if(j%2 !=0){
                countOdd = countOdd +1;
            }
        }
        return (countOdd); */

// Program 15:
class PerfectNumChecker {
    int sum = 0;

    void perfectNum(int a) {
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == a) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Immperfect Number");
        }
    }

}



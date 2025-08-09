package Oops;

import java.util.ArrayList;

public class CollectionArrayList {
    public static void main(String[] args) {

        // Assignment 1:
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Black");

        System.out.println(colors);
        colors.add(2,"Megnta Pink");
        colors.remove(4);
        System.out.println(colors.contains("Blue"));
        System.out.println(colors);

        //Assignment 2:
       ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(70);
        numbers.add(30);
        numbers.add(90);
        numbers.add(100);
        numbers.add(60);

         //max number
        int max = numbers.get(0);
        for(int num : numbers){
            if(num>max){
                max=num;
            }
        }
        System.out.println("Maximum number : "+max);

         //min number
        int min= numbers.get(0);
        for(int num : numbers){
            if(num<min){
                min=num;
            }
        }
        System.out.println("Minimum number : "+min);

       //average number
        int sum=0;
        int i=0;
        for(int num : numbers){
            sum = sum+num;
            i++;
        }
       double avg = (double) sum/i;
        System.out.println("Average is : "+avg);

       //Remove all numbers less than 60.

             numbers.removeIf(num -> num<60);
        System.out.println(numbers);

        //Assignment 3:
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Kiwi");

        fruits.sort(null);
        System.out.println(fruits);
        System.out.println(fruits.indexOf("Mango"));
        System.out.println(fruits.contains("Papaya"));
    }
}

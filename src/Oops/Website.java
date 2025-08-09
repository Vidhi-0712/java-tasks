package Oops;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a website : ");
        String websiteName = sc.next();

        if(websiteName.endsWith(".com")){
            System.out.println("Its a Commercial Practice.Oops.Website");
        }
        else if (websiteName.endsWith(".org")) {
            System.out.println("Its an Organization website");

        } else {
            System.out.println("Its an Indian Practice.Oops.Website");
        }
    }
}

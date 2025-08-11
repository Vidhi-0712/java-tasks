package Task.Task1_Domain;

import java.math.BigDecimal;
import java.util.Scanner;

public class DomainPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Renewal Years");
        int RenewalYears = sc.nextInt();
        BigDecimal ry = BigDecimal.valueOf(RenewalYears);

        CalculateDomainPricing obj = new CalculateDomainPricing();

        obj.Calculations(RenewalYears,ry);

    }
}

package Task.Task1_Domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

class CalculateDomainPricing {
     public BigDecimal RegistrationPrice = BigDecimal.valueOf(100.00);
     public BigDecimal RenewalPrice = BigDecimal.valueOf(100.00);
     public BigDecimal TransferPrice = BigDecimal.valueOf(50.00);
     public BigDecimal MarkupPercent = BigDecimal.valueOf(50.00).divide(BigDecimal.valueOf(100));
     public BigDecimal FixedPrice = BigDecimal.valueOf(100.00);
     public BigDecimal DiscountPercent = BigDecimal.valueOf(10.00).divide(BigDecimal.valueOf(100));
     public BigDecimal AnnualMarkupDecreasePercent = BigDecimal.valueOf(5.00).divide(BigDecimal.valueOf(100));
     public BigDecimal MinimumMarkupPercent = BigDecimal.valueOf(15.00).divide(BigDecimal.valueOf(100));

    public BigDecimal MarkupPrice() {
        BigDecimal markupPrice = RegistrationPrice.multiply(BigDecimal.ONE
                .add(MarkupPercent));
        return markupPrice.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal FinalConsumerPrice(){
         BigDecimal markupPrice = MarkupPrice();
        BigDecimal finalConsumerPrice = markupPrice.subtract(markupPrice
                .multiply(DiscountPercent));
        System.out.println("Markup Price : "+markupPrice);
        System.out.println("Final Consumer Price :"+finalConsumerPrice);
        return finalConsumerPrice.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal PricePerSelectedYears(BigDecimal ry){
        BigDecimal pricePerSelectedYears =(RenewalPrice.multiply(BigDecimal.ONE
                .add(MarkupPercent)).multiply(ry));
       System.out.println("Price Per Selected Years is : "+pricePerSelectedYears);
         return pricePerSelectedYears.setScale(2, RoundingMode.HALF_UP);
     }

     public BigDecimal MarkupForSelectedYears(int RenewalYears){
         BigDecimal markupForSelectedYears = MinimumMarkupPercent
                 .max(MarkupPercent.multiply(BigDecimal.ONE
                         .subtract(AnnualMarkupDecreasePercent).pow(RenewalYears)));
         return markupForSelectedYears.setScale(4, RoundingMode.HALF_UP);
     }

     public BigDecimal PricePerYearFinal(int RenewalYears){
        BigDecimal markupForSelectedYears = MarkupForSelectedYears(RenewalYears);
         BigDecimal pricePerYearFinal = RenewalPrice.multiply(BigDecimal.ONE
                 .add(markupForSelectedYears.multiply(DiscountPercent)));
         System.out.println("Markup For Selected Years is :"+markupForSelectedYears
                 .multiply(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP)
                 + "%");
         System.out.println("Price Per Year Final is :"+pricePerYearFinal.setScale(2, RoundingMode.HALF_UP));
         return pricePerYearFinal;
     }
     public BigDecimal FinalPriceWithRenewals(int RenewalYears, BigDecimal ry){
        BigDecimal finalPriceWithRenewals = RenewalPrice.multiply(BigDecimal.ONE
                .add(MarkupForSelectedYears(RenewalYears)).multiply(BigDecimal.ONE
                        .subtract(DiscountPercent)).multiply(ry));

         System.out.println("Final Price With Renewals is : "+finalPriceWithRenewals.setScale(2, RoundingMode.HALF_UP));
         return finalPriceWithRenewals;
     }
}

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

    public BigDecimal Calculations(int RenewalYears, BigDecimal ry) {
        System.out.println("Calculations for " + RenewalYears + " Years");
        System.out.println("------------------------------------------");

        BigDecimal markupPrice = RegistrationPrice.multiply(BigDecimal.ONE
                .add(MarkupPercent));
        System.out.println("Markup Price : " + markupPrice.setScale(2, RoundingMode.HALF_UP));

        BigDecimal finalConsumerPrice = markupPrice.subtract(markupPrice
                .multiply(DiscountPercent));
        System.out.println("Final Consumer Price :" + finalConsumerPrice.setScale(2, RoundingMode.HALF_UP));

        BigDecimal pricePerSelectedYears = (RenewalPrice.multiply(BigDecimal.ONE
                .add(MarkupPercent)).multiply(ry));
        System.out.println("Price Per Selected Years is : " + pricePerSelectedYears.setScale(2, RoundingMode.HALF_UP));

        BigDecimal markupForSelectedYears = MinimumMarkupPercent
                .max(MarkupPercent.multiply(BigDecimal.ONE
                        .subtract(AnnualMarkupDecreasePercent).pow(RenewalYears)));
        System.out.println("Markup For Selected Years is :" + markupForSelectedYears
                .multiply(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP)
                + "%");

        BigDecimal pricePerYearFinal = RenewalPrice.multiply(BigDecimal.ONE
                .add(markupForSelectedYears.multiply(DiscountPercent)));
        System.out.println("Price Per Year Final is :" + pricePerYearFinal.setScale(2, RoundingMode.HALF_UP));

        BigDecimal finalPriceWithRenewals = RenewalPrice.multiply(BigDecimal.ONE
                .add(markupForSelectedYears).multiply(BigDecimal.ONE
                        .subtract(DiscountPercent)).multiply(ry));
        System.out.println("Final Price With Renewals is : " + finalPriceWithRenewals.setScale(2, RoundingMode.HALF_UP));

        return finalPriceWithRenewals;
    }
}

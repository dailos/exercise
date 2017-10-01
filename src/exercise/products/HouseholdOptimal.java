package exercise.products;

import exercise.lib.Id;
import exercise.lib.Money;

import java.math.BigDecimal;

public class HouseholdOptimal implements Product {

    private static Id productId = new Id("HouseHoldOptimalId");

    final private static Money value = new Money(new BigDecimal("700"), "EU");


    @Override
    public Id getProductId()
    {
        return productId;
    }

    @Override
    public Money getValue()
    {
        return value;
    }

}

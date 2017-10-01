package exercise.products;

import exercise.lib.Id;
import exercise.lib.Money;

import java.math.BigDecimal;

public class HouseholdCompact implements Product {

    private static Id productId = new Id("HouseHoldCompactId");

    final private static Money value = new Money(new BigDecimal(650), "EU");

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

package exercise.products;

import exercise.lib.Id;
import exercise.lib.Money;


public class HouseholdCompact implements Product {

    private static Id productId = new Id("HouseHoldCompactId");

    final private static Money pricePerMeter = new Money(650, "EU");

    @Override
    public Id getProductId()
    {
        return productId;
    }

    @Override
    public Money getPrices()
    {
        return pricePerMeter;
    }
}

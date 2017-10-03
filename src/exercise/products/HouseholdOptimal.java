package exercise.products;

import exercise.lib.Id;
import exercise.lib.Money;


public class HouseholdOptimal implements Product {

    private static Id productId = new Id("HouseHoldOptimalId");

    final private static Money pricePerMeter = new Money(700, "EU");

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

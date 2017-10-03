package exercise.products;

import exercise.lib.Id;
import exercise.lib.Money;


public interface Product {

    Id getProductId();

    //Prices represent the value of the parameters the policy
    // needs to calculate the price
    //In this example it returns only the pricePerMeter.
    Money getPrices();
}

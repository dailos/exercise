package exercise.products;

import exercise.lib.Id;
import exercise.lib.Money;


public interface Product {

    Id getProductId();

    Money getValue();
}

package exercise.policies;

import exercise.lib.Id;
import exercise.lib.Money;
import exercise.products.Product;


interface Policy {

    Id getPolicyId();

    Product getProduct();

    //Total price of the policy
    Money getPrice();
}

package exercise.policies;

import exercise.insured.Property;
import exercise.products.Product;

import java.math.BigDecimal;

public class Household implements Policy {

    Property property;
    Product product;

    public Household(Property property, Product product){
        super();
        this.property = property;
        this.product = product;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(this.property.getArea()).multiply(this.product.getValue());
    }
}

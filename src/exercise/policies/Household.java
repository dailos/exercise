package exercise.policies;

import exercise.insured.Property;
import exercise.lib.Id;
import exercise.products.Product;

import java.math.BigDecimal;

public class Household implements Policy {

    Property property;
    Product product;
    private Id policyId;

    public Household(Property property, Product product)
    {
        super();
        this.property = property;
        this.product = product;
        this.policyId = new Id("policyId");
    }

    public Household(Property property)
    {
        super();
        this.property = property;
    }

    public void setProduct(Product product)
    {
        this.product = product;
    }

    @Override
    public Id getPolicyId()
    {
        return this.policyId;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(this.property.getArea()).multiply(this.product.getValue().getAmount());
    }
}

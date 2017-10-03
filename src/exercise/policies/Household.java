package exercise.policies;

import exercise.insured.Property;
import exercise.lib.Id;
import exercise.lib.Money;
import exercise.products.Product;

public class Household implements Policy {

    private Property property;
    private Product product;
    private Id policyId;

    public Household(Property property, Product product)
    {
        super();
        this.property = property;
        this.product = product;
        this.policyId = new Id("HouseHoldPolicyId");
    }

    Household(Property property)
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
        return policyId;
    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public Money getPrice() {
        return product.getPrices().multiply(property.getArea());
    }
}

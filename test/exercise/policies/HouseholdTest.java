package exercise.policies;

import exercise.insured.House;
import exercise.lib.Money;
import exercise.products.HouseholdCompact;
import exercise.products.HouseholdOptimal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HouseholdTest {

    private Household household;

    @BeforeEach
    void setUp() {
        household = new Household(new House(100), new HouseholdCompact());
    }

    @Test
    void setProduct() {
        Household policy = new Household(new House(50));
        HouseholdOptimal product = new HouseholdOptimal();
        policy.setProduct(product);
        assertEquals("HouseHoldOptimalId", policy.getProduct().getProductId().toString());
    }

    @Test
    void getPolicyId() {
        assertEquals("HouseHoldPolicyId", household.getPolicyId().toString());
    }

    @Test
    void getPrice() {
        Money price = new Money(65000);
        assertTrue(price.equals(household.getPrice()));
    }

}
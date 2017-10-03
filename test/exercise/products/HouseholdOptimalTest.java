package exercise.products;

import exercise.lib.Money;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HouseholdOptimalTest {
    private HouseholdOptimal optimal;

    @BeforeEach
    void setUp() {
        optimal = new HouseholdOptimal();
    }

    @Test
    void getProductId() {
        assertEquals("HouseHoldOptimalId", optimal.getProductId().toString());
    }

    @Test
    void getPrices() {
        Money value = new Money(700, "EU");
        assertTrue(value.equals(optimal.getPrices()));
    }

}
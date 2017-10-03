package exercise.products;

import exercise.lib.Money;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HouseholdCompactTest {
    private HouseholdCompact compact;

    @BeforeEach
    void setUp() {
        compact = new HouseholdCompact();
    }

    @Test
    void getProductId() {
        assertEquals("HouseHoldCompactId", compact.getProductId().toString());
    }

    @Test
    void getPrices() {
        Money value = new Money(650, "EU");
        assertTrue(value.equals(compact.getPrices()));
    }

}
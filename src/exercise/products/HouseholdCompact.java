package exercise.products;

import java.math.BigDecimal;

public class HouseholdCompact implements Product {

    final private static BigDecimal value = new BigDecimal("650");

    @Override
    public BigDecimal getValue() {
        return this.value;
    }
}

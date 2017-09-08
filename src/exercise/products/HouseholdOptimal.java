package exercise.products;

import java.math.BigDecimal;

public class HouseholdOptimal implements Product {

    final private static BigDecimal value = new BigDecimal("700");

    @Override
    public BigDecimal getValue() {
        return this.value;
    }

}

package exercise.policies;

import exercise.lib.Id;
import java.math.BigDecimal;

interface Policy {
    Id getPolicyId();

    BigDecimal getPrice();
}

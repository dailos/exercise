package exercise.lib;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    private Money money;

    @BeforeEach
    void setUp() {
        money = new Money(100, "AED");
    }

    @Test
    void getAmount() {
        assertEquals(BigDecimal.valueOf(100), money.getAmount());
    }

    @Test
    void getCurrency() {
        assertEquals("AED", money.getCurrency());
    }

    @Test
    void multiply() {
        double value = 10;
        assertTrue(BigDecimal.valueOf(1000).compareTo(money.multiply(value).getAmount()) == 0);
    }

    @Test
    void multiply1() {
        Money money2 = new Money(2);
        money = money2.multiply(money);
        assertEquals(BigDecimal.valueOf(200), money.getAmount());
        assertEquals("EU", money.getCurrency());
    }

    @Test
    void equals() {
        Money money1 = new Money(10);
        Money money2 = new Money(10);
        Money money3 = new Money(10, "AED");
        Money money4 = new Money(20);
        assertTrue(money1.equals(money2));
        assertFalse(money1.equals(money3));
        assertFalse(money1.equals(money4));
    }

    @Test
    void testTtoString() {
        assertEquals("100 AED", money.toString());
    }

}
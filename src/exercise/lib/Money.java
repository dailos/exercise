package exercise.lib;

import java.math.BigDecimal;

public class Money {

    private String currency;
    private BigDecimal amount;
    private static String DEFAULT_CURRENCY = "EU";

    public Money(BigDecimal amount, String currency)
    {
        this.amount = amount;
        this.currency = currency;
    }

    public Money(int amount, String currency) {
        this.amount = BigDecimal.valueOf(amount);
        this.currency = currency;
    }

    public Money(BigDecimal amount)
    {
        this.amount = amount;
        currency = DEFAULT_CURRENCY;
    }

    public Money(int amount) {
        this.amount = BigDecimal.valueOf(amount);
        currency = DEFAULT_CURRENCY;
    }

    BigDecimal getAmount()
    {
        return amount;
    }

    String getCurrency()
    {
        return currency;
    }


    Money multiply(Money value) {
        if (!currency.equals(value.getCurrency())) {
            throw new IllegalArgumentException();
        }
        amount = amount.multiply(value.getAmount());
        return this;
    }

    public Money multiply(double value) {
        amount = amount.multiply(BigDecimal.valueOf(value));
        return this;
    }

    public boolean equals(Money money) {
        return (currency.equals(money.getCurrency()) && amount.compareTo(money.getAmount()) == 0);
    }

    public String toString() {
        return amount + " " + currency;
    }

}

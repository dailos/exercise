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

    public Money(BigDecimal amount)
    {
        this.amount = amount;
        this.currency = DEFAULT_CURRENCY;
    }

    public BigDecimal getAmount()
    {
        return this.amount;
    }

    public String getCurrency()
    {
        return this.currency;
    }

}

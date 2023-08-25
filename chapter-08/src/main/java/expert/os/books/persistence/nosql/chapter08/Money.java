package expert.os.books.persistence.nosql.chapter08;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

public record Money(Currency currency, BigDecimal amount){

    public Money {
        Objects.requireNonNull(currency, "Currency cannot be null");
        Objects.requireNonNull(amount, "Amount cannot be null");
    }
}

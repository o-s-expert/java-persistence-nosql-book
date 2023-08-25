package expert.os.books.persistence.nosql.chapter08;

import java.math.BigDecimal;
import java.util.Currency;

public record Money(Currency currency, BigDecimal amount){
}

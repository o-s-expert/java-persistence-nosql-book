package expert.os.books.persistence.nosql.auditaded;

import java.util.function.Supplier;

public class FastSupplier implements Supplier<String> {

    @Timed
    @Override
    public String get() {
        return "The Fast supplier result";
    }
}

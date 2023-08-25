package expert.os.books.persistence.nosql.chapter08;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SalaryValidator implements ConstraintValidator<SalaryConstraint, Money> {

    @Override
    public boolean isValid(Money value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }

        return false;
    }
}

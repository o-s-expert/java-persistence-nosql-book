package expert.os.books.persistence.nosql.chapter08;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    private Validator validator;

    @BeforeEach
    public void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void shouldNotCreateWorkerWithBlankNickname() {
        Worker worker = Worker.builder()
                .nickname("")
                .name("John Doe")
                .working(true)
                .bio("I am a software engineer")
                .age(30)
                .email("email@os.expert").build();
        Set <ConstraintViolation<Worker>> violations = validator.validate(worker);

        Assertions.assertThat(violations)
                .isNotEmpty()
                .hasSize(1)
                .map(ConstraintViolation::getMessage).contains("Nickname cannot be blank");
}

}
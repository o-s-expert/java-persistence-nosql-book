package expert.os.books.persistence.nosql.chapter08;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        Worker worker = new WorkerBuilder()
                .nickname("")
                .name("John Doe")
                .working(true)
                .bio("I am a software engineer")
                .age(30)
                .email("email@os.expert").build();
        var violations = validator.validate(worker);
}

}
package expert.os.books.persistence.nosql.chapter08;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Worker {
    @NotBlank(message = "Nickname cannot be blank")
    private String nickname;

    @NotBlank(message = "Name cannot be blank")
    private String name;


    @AssertTrue
    private boolean working;

    @Size(min = 10, max = 200, message
            = "Bio must be between 10 and 200 characters")
    private String bio;

    @Min(value = 18, message = "A worker should not be less than 18")
    @Max(value = 80, message = "A worker should not be greater than 80")
    private int age;

    @Email(message = "Email should be valid")
    private String email;

    @NotEmpty(message = "Skills cannot be empty")
    @Max(value = 3, message = "You cannot select up to 3 skills")
    private List<String> skills;

}

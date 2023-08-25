package expert.os.books.persistence.nosql.chapter08;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank(message = "Nickname cannot be blank")
    private String nickname;

    @NotBlank(message = "Name cannot be blank")
    private String name;


    @AssertTrue
    private boolean working;

    @Size(min = 10, max = 200, message
            = "About Me must be between 10 and 200 characters")
    private String bio;

    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 150, message = "Age should not be greater than 150")
    private int age;

    @Email(message = "Email should be valid")
    private String email;


}

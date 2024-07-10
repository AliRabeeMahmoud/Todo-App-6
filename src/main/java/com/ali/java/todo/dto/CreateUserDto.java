package com.ali.java.todo.dto;

import com.ali.java.todo.validation.ValidateAgeType;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserDto {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    //@NotBlank
    @Email
    @Schema(
            description = "email of the user",
            type = "string",
            example = "ali@mail.com")
    private String email;

    @NotBlank

    private String userName;

    @NotBlank
    @Size(min = 4, max = 12)
    private String password;

    @ValidateAgeType
    @NotBlank
    @Schema(allowableValues = {"child", "teenager", "adult", "old"})
    private String ageType;  //child, teenager, adult, old
    //next phase, make another enum field for validation
}

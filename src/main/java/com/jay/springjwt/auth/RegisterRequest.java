package com.jay.springjwt.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    @Size(min=3, message = "First Name is too short")
    private String firstName;
    @Size(min=3, message = "Last Name is too short")
    private String lastName;

    @Email(message = "Invalid Email provided")
    private String email;
    @Size(min=8, message = "Password should have min 8 characters")
    private String password;
}

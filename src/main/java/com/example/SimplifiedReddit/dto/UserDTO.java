package com.example.SimplifiedReddit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;

    @Email(message = "Email must be in appropriate format.")
    private String email;

    @NotBlank(message = "Username must not be blank or null.")
    private String username;

    @NotBlank(message = "Password must not be blank or null.")
    private String password;

    private String role;
}

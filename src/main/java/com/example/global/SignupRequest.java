package com.example.global;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import com.example.global.PasswordValidate;

public class SignupRequest {

    @NotBlank(message = "First name is required")
    @Size(max = 100, message = "First name must be at most 100 characters")
    private String fname;

    @NotBlank(message = "Password is required")
    @PasswordValidate
    private String password;

    // getters and setters
    public String getFname() { return fname; }
    public void setFname(String fname) { this.fname = fname; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
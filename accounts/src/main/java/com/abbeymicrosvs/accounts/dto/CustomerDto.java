package com.abbeymicrosvs.accounts.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name should not be null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer nae should be between 5 and 30 characters")
    private String name;

    @NotEmpty(message = "Email should not be null or empty")
    @Email(message = "Invalid email address")
    private String email;

    @NotEmpty(message = "Mobile number should not be null or empty")
    @Pattern(regexp = "(^$|^[0-9]{10})", message = "Mobile number must be 10 digits")

    private String mobileNumber;

    @NotEmpty
    private AccountsDto accountsDto;

}

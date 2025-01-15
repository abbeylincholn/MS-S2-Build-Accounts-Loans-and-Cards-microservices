package com.abbeymicrosvs.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer", example = "John Doe"
    )
    @NotEmpty(message = "Name should not be null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer nae should be between 5 and 30 characters")
    private String name;

    @Schema(
            description = "Email of the customer", example = "zDw4j@example.com"
    )
    @NotEmpty(message = "Email should not be null or empty")
    @Email(message = "Invalid email address")
    private String email;

    @Schema(
            description = "Mobile number of the customer", example = "2623536243"
    )
    @NotEmpty(message = "Mobile number should not be null or empty")
    @Pattern(regexp = "(^$|^[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;


    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;

}

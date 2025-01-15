package com.abbeymicrosvs.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Account",
        description = "Schema to hold Account Information"
)
public class AccountsDto {

    @NotEmpty(message = "Account number should not be null or empty")
    @Pattern(regexp = "(^$|^[0-9]{10})", message = "Account number must be 10 digits")
    @Schema(
            description = "Account Number of AbbeyBank"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account type should not be null or empty")
    @Schema(
            description = "AccountType of AbbeyBank", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "Branch address should not be null or empty")
    @Schema(
            description = "AbbeyBank Branch Address", example = "123 Main Street, New York"
    )
    private String branchAddress;

}

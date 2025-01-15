package com.abbeymicrosvs.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.accounts.controller") })  // check for the @component annotation
@EnableJpaRepositories("com.eazybytes.accounts.repository")
@EntityScan("com.eazybytes.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "AbbeyBank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Boss Oddy",
						email = "oddy@cst.technology",
						url = "https://cst.technology"
				),
				license = @License(
					name = "Apache 2.0",
					url = "https://cst.technology"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "AbbeyBank Accounts microservice REST API Documentation",
				url = "https://cst.technology"
		)
)


public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}

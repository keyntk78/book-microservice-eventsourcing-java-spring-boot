package com.ntk.employeeservice.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Employee Api Specification - NTK",
                description = "Api documentation for Employee Service",
                version = "1.0",
                contact = @Contact(
                        name = "Tuan Kiet",
                        email = "key.ntk@gmail.com",
                        url = "https://ntk.vercel.app"
                ),
                license = @License(
                        name = "MIT License",
                        url = "https://ntk.vercel.app/licenses"
                ),
                termsOfService = "https://ntk.vercel.app/terms"
        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:9002"
                ),
                @Server(
                        description = "Dev ENV",
                        url = "https://employee-service.dev.com"
                ),
                @Server(
                        description = "Prod ENV",
                        url = "https://employee-service.prod.com"
                ),
        }
)
public class OpenApiConfig {
}

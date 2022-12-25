package com.oumellahni.gestion_stock.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nabil on 25 Dec 2022 at 13:23
 **/

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                    .components(new Components())
                    .info(new Info().title("Inventory Management Application API").description(
                            "This is a sample Spring Boot RESTful service using springdoc-openapi and OpenAPI 3."));
    }

}



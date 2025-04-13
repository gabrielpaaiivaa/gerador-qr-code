package com.geradorqrcode.qrcode_gerador.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Gerador de QR Code",
                version = "1.0",
                description = "API para gerar QR Codes de forma simples e eficiente"
        )
)


public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi(){
        return GroupedOpenApi.builder()
                .group("spring-boot-application")
                .pathsToMatch("/**")
                .build();
    }
}

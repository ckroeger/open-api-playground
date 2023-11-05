package com.github.ckroeger.openapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.util.List;

@Configuration
public class AppConfig {

    private String serverDescription = "API Description";

    @Bean
    public OpenAPI springUserOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Petstore API")
                        .description("The available REST-API to create qr-codes.")
                        .license(new License()
                                .name("MIT License")
                                .url("http://www.opensource.org/licenses/mit-license.php")))
                .servers(List.of(new Server().url("/").description(serverDescription)));
    }

    @Bean
    @Primary
    public Jackson2ObjectMapperBuilder customObjectMapper() {
        return new Jackson2ObjectMapperBuilder()
                // other configs are possible
                .modules(new JsonNullableModule());
    }
}

package com.j2ee;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
public class OpenAPIConfig {
@Bean
public OpenAPI customOpenAPI() {
License license = new License().name("Apache2.0").url("https://springdoc.org/");
Info info = new Info().title("J2EE TD Spring RESTAPI").version("v0.0.1").license(license);
return new OpenAPI().info(info);
}
@Bean
public GroupedOpenApi completeApi() {
return
GroupedOpenApi.builder().group("Complete").pathsToMatch("/**").build();
}
}
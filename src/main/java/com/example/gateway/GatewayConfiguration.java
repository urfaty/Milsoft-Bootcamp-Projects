package com.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    @Bean
    RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder
                .routes()
                .route("ModuleTwo", r -> r
                        .path("/module2/**")
                        .filters(f -> f.
                                addRequestHeader("RequestHeader2", "Gelen2")
                                .addResponseHeader("ResponseHeader2", "Giden2"))
                        .uri("http://localhost:8082/"))
                .build();
    }
}

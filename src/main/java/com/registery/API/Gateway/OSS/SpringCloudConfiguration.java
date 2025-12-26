package com.registery.API.Gateway.OSS;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;





import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class SpringCloudConfiguration {







    @Bean
    RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
        return
                builder
                        .routes()
                        .route("Swag",r
                                -> r.path("/swag/api/v1.0/**" )
                                .filters(f
                                        -> f.addRequestHeader("X-Response-Header","World"))
                                .uri("http://localhost:9090")) //uri of microservice
                        .build();
    }





}
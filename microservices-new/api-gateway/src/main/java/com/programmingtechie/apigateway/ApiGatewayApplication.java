package com.programmingtechie.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
 * @EnableEurekaClient is not required for newer versions as it got deprecated
 *
 * In newer versions it should work without adding any annotation
 * but in some cases might need to add @EnableDiscoveryClient instead
 */
public class ApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}

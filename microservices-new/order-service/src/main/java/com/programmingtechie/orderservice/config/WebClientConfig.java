package com.programmingtechie.orderservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    @LoadBalanced // with this when there are multiple instances of a server eureka will try making contact to every server until a connection is made
    public WebClient.Builder webClientBuilder(){
        return WebClient.builder();
    }
}

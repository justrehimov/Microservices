package com.desofme.photoappzuulapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhotoAppZuulApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppZuulApiGatewayApplication.class, args);
    }

}

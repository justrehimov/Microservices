package com.desofme.photoappaccountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.HttpMethod;

@SpringBootApplication
@EnableDiscoveryClient
@RequestMapping(HttpMethod.GET)
public class PhotoAppAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppAccountServiceApplication.class, args);
    }

}

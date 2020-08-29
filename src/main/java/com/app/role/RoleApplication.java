package com.app.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class RoleApplication implements CommandLineRunner {

    @Autowired
    RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RoleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ResponseEntity<String> response = restTemplate.getForEntity("http://users/api/v1/dummies/", String.class);
        System.out.println(response.getBody());
    }
}

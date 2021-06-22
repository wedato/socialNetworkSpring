package com.example.socialNetwork;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SocialNetworkAPI {

    public static void main(String[] args) {

        SpringApplication.run(SocialNetworkAPI.class, args);

    }

}

package com.example.socialMediaSpringTest;


import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TwitterSpringTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(TwitterSpringTestApplication.class, args);

    }

}

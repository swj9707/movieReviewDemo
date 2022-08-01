package com.example.moviereviewdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MovieReviewDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieReviewDemoApplication.class, args);
    }

}

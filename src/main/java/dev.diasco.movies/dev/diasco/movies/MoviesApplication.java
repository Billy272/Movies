package dev.diasco.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootConfiguration
@RestController
public class MoviesApplication{

    public static void main(String[] args){
        SpringApplication.run(MoviesApplication.class, args);
    }
}



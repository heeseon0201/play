package com.hs.play.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hs.play"})
public class PlayAplication {

    public static void main(String[] args) {
        //System.out.println("PlayAplication main start");
        SpringApplication.run(PlayAplication.class, args);
    }
}

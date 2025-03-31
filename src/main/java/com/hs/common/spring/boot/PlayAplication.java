package com.hs.common.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayAplication {

    public static void main(String[] args) {
        System.out.println("PlayAplication main start");
        SpringApplication.run(PlayAplication.class, args);
    }
}

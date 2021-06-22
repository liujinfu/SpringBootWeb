package com.cxytiandi.spring_boot_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.cxytiandi"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

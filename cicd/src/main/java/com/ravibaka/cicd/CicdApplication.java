package com.ravibaka.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ResetController
public class CicdApplication {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to CI/CD";
    }
    public static void main(String[] args) {
        SpringApplication.run(CicdApplication.class, args);
    }

}

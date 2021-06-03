package com.statement.modules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class StatementStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(StatementStarterApplication.class, args);
    }

}

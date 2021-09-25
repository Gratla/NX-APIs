package com.example.commandapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class CommandApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(CommandApiApplication.class, args);
  }
}

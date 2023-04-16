package edu.fra.uas.beanbeispiel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeanBeispielApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanBeispielApplication.class, args);
    }

    @Bean
    CommandLineRunner init() {
        CommandLineRunner action = new CommandLineRunner() {

            @Override
            public void run(String... args) {
                System.out.println("Hallo World");
            }
        };
        return action;
    }

}

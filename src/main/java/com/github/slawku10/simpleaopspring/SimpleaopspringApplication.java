package com.github.slawku10.simpleaopspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication

public class SimpleaopspringApplication{

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        SpringApplication.run(SimpleaopspringApplication.class, args);
    }

}

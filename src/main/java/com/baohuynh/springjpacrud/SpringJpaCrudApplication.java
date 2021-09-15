package com.baohuynh.springjpacrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;

@SpringBootApplication
@EntityScan("com.baohuynh.springjpacrud")
public class SpringJpaCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaCrudApplication.class, args);
    }

}

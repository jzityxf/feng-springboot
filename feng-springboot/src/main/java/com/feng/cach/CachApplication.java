package com.feng.cach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CachApplication {

    public static void main(String[] args) {
        SpringApplication.run(CachApplication.class, args);
    }
}

package com.carpark;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan
@SpringBootApplication

public class CarparkApplication {
    //private static final Logger LOGGER= LogManager.getLogger(CarparkApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(CarparkApplication.class, args);
    }
}

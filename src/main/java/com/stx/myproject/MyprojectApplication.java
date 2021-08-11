package com.stx.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@ComponentScan("com.citic.core")
public class MyprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyprojectApplication.class, args);
    }

}

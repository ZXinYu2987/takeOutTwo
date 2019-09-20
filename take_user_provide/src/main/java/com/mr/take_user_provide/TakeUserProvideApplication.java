package com.mr.take_user_provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TakeUserProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeUserProvideApplication.class, args);
    }

}

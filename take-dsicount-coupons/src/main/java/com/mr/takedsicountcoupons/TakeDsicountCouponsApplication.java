package com.mr.takedsicountcoupons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TakeDsicountCouponsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeDsicountCouponsApplication.class, args);
    }

}

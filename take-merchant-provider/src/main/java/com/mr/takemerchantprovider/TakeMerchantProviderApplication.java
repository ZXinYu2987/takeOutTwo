package com.mr.takemerchantprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TakeMerchantProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeMerchantProviderApplication.class, args);
    }

}

package com.mr.takemerchantconsummer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TakeMerchantConsummerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeMerchantConsummerApplication.class, args);
    }

}

package com.bz.take.history;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = {"com.bz.take.history.mapper"})
public class TakeHistoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeHistoryApplication.class, args);
    }

}

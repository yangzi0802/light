package com.light.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@RefreshScope
public class MemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
}

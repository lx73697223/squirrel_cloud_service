package com.pi.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringCloudApplication
@EnableConfigServer
public class SquirrelConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SquirrelConfigServerApplication.class, args);
    }

}

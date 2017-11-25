package com.pi.registry.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringCloudApplication
@EnableEurekaServer
public class SquirrelRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SquirrelRegistryApplication.class, args);
    }

}

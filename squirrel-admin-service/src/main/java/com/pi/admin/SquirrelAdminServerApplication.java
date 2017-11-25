package com.pi.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringCloudApplication
@EnableAdminServer
@EnableTurbine
public class SquirrelAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SquirrelAdminServerApplication.class, args);
    }

}

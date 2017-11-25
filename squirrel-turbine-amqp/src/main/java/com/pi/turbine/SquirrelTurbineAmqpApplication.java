package com.pi.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringCloudApplication
@EnableTurbineStream
public class SquirrelTurbineAmqpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SquirrelTurbineAmqpApplication.class, args);
    }

}

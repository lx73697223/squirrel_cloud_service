package com.pi.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringCloudApplication
@EnableHystrixDashboard
public class SquirrelHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SquirrelHystrixDashboardApplication.class, args);
    }

}

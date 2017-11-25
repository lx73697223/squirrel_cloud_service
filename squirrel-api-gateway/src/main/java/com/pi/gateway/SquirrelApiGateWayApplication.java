package com.pi.gateway;

import com.pi.gateway.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringCloudApplication
// 增加zuul proxy代理功能, 支持网关路由。
// 如果不使用Zuul提供的Filter和反向代理的功能的话，此处可以使用 @EnableZuulServer。
@EnableZuulProxy
public class SquirrelApiGateWayApplication {

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(SquirrelApiGateWayApplication.class, args);
    }

}

# hystrix dashboard

## 客户端

* 依赖
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-hystrix</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

* 配置
```
确保启动类已经使用 @EnableCircuitBreaker 或 @EnableHystrix 注解
```

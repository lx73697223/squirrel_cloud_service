# turbine amqp

使用消息队列的方式聚合服务监控信息

hystrix dashboard 可以通过访问 http://localhost:8020/turbine.stream 获取已聚合好的服务监控

## 客户端

* 依赖
```
<!-- 熔断器 -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-hystrix</artifactId>
</dependency>
<!-- 监控消息输出到消息队列 -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-netflix-hystrix-stream</artifactId>
</dependency>
<!-- 监控与管理 -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
<!-- 消息总线 -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-bus-amqp</artifactId>
</dependency>
```

* 配置
```
# 消息队列
spring.rabbitmq.host=rabbitmq
spring.rabbitmq.port=5672
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
spring.rabbitmq.virtual-host=rabbitAMQPVHost
spring.rabbitmq.listener.simple.retry.enabled=true
spring.rabbitmq.template.retry.enabled=true
```


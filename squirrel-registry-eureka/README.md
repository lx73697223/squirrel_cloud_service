# registry eureka

## 客户端

* 依赖
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-eureka</artifactId>
</dependency>
```

* 配置
```
eureka.client.service-url.defaultZone=http://${registry-eureka-host}/eureka/
```


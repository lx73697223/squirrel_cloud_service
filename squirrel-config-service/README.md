# config server

## 客户端

* 依赖
```
<!-- 配置管理 -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-config</artifactId>
</dependency>
```

* 配置 (必须配置在bootstrap文件中, 服务发现配置也是, 因为config server配置是在 org.springframework.cloud.config.server.bootstrap.ConfigServerBootstrapConfiguration中设置的)
```
# cloud configw
spring.cloud.config.discovery.enabled=true
spring.cloud.config.discovery.service-id=pi-config-server
spring.cloud.config.fail-fast=true
spring.cloud.config.retry.max-attempts=5
```

---

### HTTP方式访问配置文件支持的格式 
```
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
```
* {application}=spring.config.name
* {profile}=spring.profile.active
* {label}=git提交id，分支或标签

### Notice
* 如果git分支或标签名称包含斜杠（“/”），则应使用特殊字符串“（_）”指定HTTP URL中的标签，以避免与其他URL路径模糊。例如，如果标签是foo/bar，则替换斜杠将导致类似于foo(_)bar的标签。

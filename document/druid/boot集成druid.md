# 环境准备

官方文档：https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter

#### 1、maven依赖

```
	<!-- mysql 驱动包 -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>5.1.46</version>
    </dependency>

    <!-- druid数据库连接池 -->
    <dependency>
        <groupId>com.alibaba</groupId>
        <artifactId>druid-spring-boot-starter</artifactId>
        <version>1.1.10</version>
    </dependency>
	
	<!-- mybatis -->
    <dependency>
        <groupId>org.mybatis.spring.boot</groupId>
        <artifactId>mybatis-spring-boot-starter</artifactId>
        <version>1.3.1</version>
    </dependency>
```

#### 2、配置扫描路径

```yaml
spring:
  datasource:
    driver-class-name: com.mysql.jdbc.Driver
    druid:
      url: jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&autoReconnect=true&useSSL=false
      username: root
      password: 123456
```

#### 3、
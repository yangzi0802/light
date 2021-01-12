# 环境准备

官方文档：https://github.com/mybatis/spring-boot-starter

我用的mybatis-spring-boot-starter

#### 1、maven依赖

```
	<!-- mybatis -->
    <dependency>
        <groupId>org.mybatis.spring.boot</groupId>
        <artifactId>mybatis-spring-boot-starter</artifactId>
        <version>1.3.1</version>
    </dependency>
```

#### 2、配置扫描路径

```yaml
mybatis:
  mapper-locations: classpath*:/mapper/**/*.xml
```

#### 3、
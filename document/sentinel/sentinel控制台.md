# sentinel控制台

#### 1、Sentinel 控制台是流量控制、熔断降级规则统一配置和管理的入口，它为用户提供了机器自发现、簇点链路自发现、监控、规则配置等功能。在 Sentinel 控制台上，我们可以配置规则并实时查看流量控制效果。

官方文档：https://github.com/alibaba/Sentinel/tree/master/sentinel-dashboard

#### 2、获取控制台

可以从https://github.com/alibaba/Sentinel/releases 下载最新版本的控制台 jar 包。

可以从https://github.com/alibaba/Sentinel/tree/master/sentinel-dashboard 下载源码进行编译获取

#### 3、编译

```shell
mvn clean package
```

#### 4、启动

```shell
java -Dserver.port=8080 \
-Dcsp.sentinel.dashboard.server=localhost:8080 \
-Dproject.name=sentinel-dashboard \
-jar target/sentinel-dashboard.jar
```

#### 5、客户端（应用）接入 https://github.com/alibaba/Sentinel/wiki/%E6%8E%A7%E5%88%B6%E5%8F%B0#3-%E5%AE%A2%E6%88%B7%E7%AB%AF%E6%8E%A5%E5%85%A5%E6%8E%A7%E5%88%B6%E5%8F%B0

##### 5.1 引入maven依赖

```
<dependency>
    <groupId>com.alibaba.csp</groupId>
    <artifactId>sentinel-transport-simple-http</artifactId>
    <version>x.y.z</version>
</dependency>
```

##### 5.2 配置启动参数

启动时加入 JVM 参数 `-Dcsp.sentinel.dashboard.server=consoleIp:port` 指定控制台地址和端口。若启动多个应用，则需要通过 `-Dcsp.sentinel.api.port=xxxx` 指定客户端监控 API 的端口（默认是 8719）。

从 1.6.3 版本开始，控制台支持网关流控规则管理。您需要在接入端添加 `-Dcsp.sentinel.app.type=1` 启动参数以将您的服务标记为 API Gateway，在接入控制台时您的服务会自动注册为网关类型，然后您即可在控制台配置网关规则和 API 分组。

除了修改 JVM 参数，也可以通过配置文件取得同样的效果。更详细的信息可以参考 https://github.com/alibaba/Sentinel/wiki/%E5%90%AF%E5%8A%A8%E9%85%8D%E7%BD%AE%E9%A1%B9。
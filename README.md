# 项目介绍



# 开发环境

| 工具  | 版本  |                           下载地址                           |
| :---: | :---: | :----------------------------------------------------------: |
| Java  |  1.8  | https://www.oracle.com/java/technologies/javase-downloads.html |
| Maven | 3.3.9 |            https://maven.apache.org/download.cgi             |
| MySQL |  5.7  |        https://dev.mysql.com/downloads/mysql/5.7.html        |
| Redis |       |                                                              |
| NGINX |       |  https://docs.nginx.com/nginx/admin-guide/installing-nginx/  |



# 技术栈

|                 技术                 |      说明      |                     官方网站                     |
| :----------------------------------: | :------------: | :----------------------------------------------: |
|     Spring Boot (2.3.4.RELEASE)      | 容器 + MVC框架 |      https://spring.io/projects/spring-boot      |
|      Spring Cloud (Hoxton.SR8)       |   微服务框架   |     https://spring.io/projects/spring-cloud      |
| Spring Cloud Alibaba (2.2.3.RELEASE) |   微服务框架   | https://spring.io/projects/spring-cloud-alibaba  |
|                MySQL                 |     数据库     |            https://dev.mysql.com/doc/            |
|                Druid                 |  数据库连接池  |         https://github.com/alibaba/druid         |
|               MyBatis                |    ORM框架     |  http://www.mybatis.org/mybatis-3/zh/index.html  |
|              PageHelper              |    分页插件    | https://github.com/pagehelper/Mybatis-PageHelper |
|                Redis                 |   缓存中间件   |                https://redis.io/                 |
|               RabbitMq               |   消息中间件   |            https://www.rabbitmq.com/             |



# 目录结构

```lua
light
├── light-common 	-- 工具类及通用代码模块
├── light-auth 		-- 认证中心
├── light-gateway 	-- API网关服务
├── light-admin 	-- 后台管理系统服务
├── light-registry 	-- 服务注册中心
├── light-member 	-- 会员服务
├── light-forum 	-- 论坛服务
├── light-third 	-- 第三方服务
└── config 			-- 配置中心文件
```



# 启动流程

### 一、启动注册中心及配置中心nacos（light-registry/nacos/bin/）

##### 1、启动nacos服务端

**Linux/Unix/Mac**

启动命令(standalone代表着单机模式运行，非集群模式):

```shell
sh startup.sh -m standalone
```

如果您使用的是ubuntu系统，或者运行脚本报错提示[[符号找不到，可尝试如下运行：

```shell
bash startup.sh -m standalone
```

**Windows**

启动命令(standalone代表着单机模式运行，非集群模式):

```shell
cmd startup.cmd -m standalone
```

##### 2、查看nacos管理页面

http://localhost:8848/nacos/

### 二、


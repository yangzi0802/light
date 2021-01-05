# 项目介绍



# 开发环境

| 工具  | 版本  | 下载地址 |
| :---: | :---: | :------: |
| Java  | 1.8 + |          |
| MySQL | 5.7 + |          |
| Redis |       |          |
| NGINX |       |          |



# 技术栈

|                 技术                 |      说明      |                     官方网站                     |
| :----------------------------------: | :------------: | :----------------------------------------------: |
|     Spring Boot (2.3.4.RELEASE)      | 容器 + MVC框架 |      https://spring.io/projects/spring-boot      |
|      Spring Cloud (Hoxton.SR8)       |   微服务框架   |     https://spring.io/projects/spring-cloud      |
| Spring Cloud Alibaba (2.2.3.RELEASE) |   微服务框架   | https://spring.io/projects/spring-cloud-alibaba  |
|                MySQL                 |     数据库     |                                                  |
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
├── light-mini-app 	-- 小程序接口服务
└── config 			-- 配置中心文件
```

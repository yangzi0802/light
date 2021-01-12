# 环境准备

官方文档：https://nacos.io/zh-cn/docs/quick-start-spring-cloud.html

#### 下载源码或安装包 （两种方式）

###### 源码安装 从 Github 上下载源码方式 (前提需要安装jdk 1.8+及maven 3.2.x+)

```shell
git clone https://github.com/alibaba/nacos.git
cd nacos/
mvn -Prelease-nacos -Dmaven.test.skip=true clean install -U ls -al distribution/target/

// change the $version to your actual path
cd distribution/target/nacos-server-$version/nacos/bin
```

###### 安装包 https://github.com/alibaba/nacos/releases 下载对应的包即可（nacos-server-$version.zip）

```shell
unzip nacos-server-$version.zip 或者 tar -xvf nacos-server-$version.tar.gz
cd nacos/bin
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

注：此处我的改成了8850端口（${nacos}/conf/application.properties修改不生效）

startup.cmd 

```
set "NACOS_OPTS=%NACOS_OPTS% -Dserver.port=8850"
```

http://localhost:8850/nacos/

##### 3、新建
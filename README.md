# 腾讯智能制造云平台

#### 开发环境

1. jdk 1.8

2. mysql 5.0 +

3. 阿里云

4. apache-tomcat-9.0.12

5. win10/9/8/7

#### 开发工具

1. IDEA 2019

2. navicat

4. PowerDesigner 15

5. Axure RP 8

6. Xshell 6

7. Postman

8. RedisDesktopManager

#### 版本控制工具

1. git

#### 使用技术

##### 后端 

1. maven

2. mybatis逆向工程

3. springboot + mybatis

4. spring security权限控制

5. redis

6. [Lambda](https://www.runoob.com/java/java8-lambda-expressions.html)

#### 常见问题

##### 运行时redis错误

：[redis]Connection failure occurred. Restarting subscription task after 5000 ms
  1.查看SpringBoot配置文件确认本地redis配置是否正确
  
  2.确保redis正确运行在后台
  
  3.缓存已经超出redis服务所规定的订阅缓存限制值，查看redis.conf配置文件:redis.windows.conf。
    这一句：client-output-buffer-limit pubsub 32mb 8mb 60
    Redis订阅客户端订阅buffer超过32M或持续60秒超过8M,订阅立即被关闭！解决改问题把限制值调大即可解	决！
    这里设置为：client-output-buffer-limit pubsub 256mb 64mb 60
  
  4.用 redis-server.exe redis.windows.conf 命令启动redis  指定配文件（如果关掉，会出现问题）



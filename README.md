# changeToDubbo
本工程是从传统web工程迁移到dubbo工程的示例，采用springmvc+spring作为技术框架，maven作为项目管理工具
## 子工程介绍
* zmb-1-parent maven 父工程，采用父子并列结构，方便扩展
* zmb-common-config 用于存放公共配置
* zmb-new-api-demo  用于演示dubbo的api工程
* zmb-new-consumer-provider 用于演示一个应用同时包含消费者和提供者，以dubbo 打包方式运行
* zmb-old-web-client 用于演示传统web工程如何集成dubbo 消费者
* zmb-old-web-Server 用于演示传统web工程如何集成dubbo 提供者

##  运行依赖环境
* zookeeper
* monitor
* jdk1.8

## 系统调用路径
* zmb-old-web-client-->zmb-old-web-Server
* zmb-old-web-client-->zmb-new-consumer-provider-->zmb-old-web-Server

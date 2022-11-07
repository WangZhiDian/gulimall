package com.feng.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 在nacos浏览器中还可以配置：
 *
 * 命名空间：用作配置隔离。（一般每个微服务一个命名空间）
 *
 * 默认public。默认新增的配置都在public空间下
 *
 * 	开发、测试、开发可以用命名空间分割。properties每个空间有一份。
 *
 * 	在bootstrap.properties里配置
 *
 * spring.cloud.nacos.config.namespace=b176a68a-6800-4648-833b-be10be8bab00  	# 可以选择对应的命名空间 ,即写上对应环境的命名空间ID
 *
 * 也可以为每个微服务配置一个命名空间，微服务互相隔离
 *
 * 配置集：一组相关或不相关配置项的集合。
 *
 * 配置集ID：类似于配置文件名，即Data ID
 *
 * 配置分组：默认所有的配置集都属于DEFAULT_GROUP。自己可以创建分组，比如双十一，618，双十二
 *
 * spring.cloud.nacos.config.group=DEFAULT_GROUP  # 更改配置分组
 * 最终方案：每个微服务创建自己的命名空间，然后使用配置分组区分环境（dev/test/prod）
 *
 * 加载多配置集
 * 我们要把原来application.yml里的内容都分文件抽离出去。我们在nacos里创建好
 * 后，在coupons里指定要导入的配置即可。
 *
 * bootstrap.properties
 * spring.application.name=gulimall-coupon
 * spring.cloud.nacos.config.server-addr=192.168.11.1:8848
 *
 *
 * spring.cloud.nacos.config.namespace=ed042b3b-b7f3-4734-bdcb-0c516cb357d7  # # 可以选择对应的命名空间 ，即写上对应环境的命名空间ID
 * spring.cloud.nacos.config.group=dev  # 配置文件所在的组
 *
 * spring.cloud.nacos.config.ext-config[0].data-id=datasource.yml
 * spring.cloud.nacos.config.ext-config[0].group=dev
 * spring.cloud.nacos.config.ext-config[0].refresh=true
 *
 * spring.cloud.nacos.config.ext-config[1].data-id=mybatis.yml
 * spring.cloud.nacos.config.ext-config[1].group=dev
 * spring.cloud.nacos.config.ext-config[1].refresh=true
 *
 * spring.cloud.nacos.config.ext-config[2].data-id=other.yml
 * spring.cloud.nacos.config.ext-config[2].group=dev
 * spring.cloud.nacos.config.ext-config[2].refresh=true
 *
 *
 * datasource.yml
 * spring:
 *   datasource:
 *     driver-class-name: com.mysql.cj.jdbc.Driver
 *     url: jdbc:mysql://192.168.1.103:3306/gulimall_sms?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai
 *     username: root
 *     password: root
 *
 * mybatis.yml
 * mybatis-plus:
 *   mapper-locations: classpath:xxx
    *global-config:
    *db-config:
    *id-type:auto
    *
    *other.yml
    *spring:
    *application:
    *name:gulimall-coupon
    *cloud:
    *nacos:
    *discovery:
    *server-addr:192.168.11.1:8848
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class);
    }

}

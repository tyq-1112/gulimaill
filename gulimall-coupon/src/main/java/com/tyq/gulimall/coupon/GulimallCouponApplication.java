package com.tyq.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 将服务注册到nacos中
 * 1、引入 Nacos Discovery Starter依赖
 * 2、配置 Nacos Server地址
 * 3、使用EnableDiscoveryClient开启服务注册发现功能
 * 4、注意：每一个应用都应该有名字，才能注册上去，
 */
/**
 * 想要远程调用别的服务
 * 1、引入open-feign
 * 2、编写一个接口，告诉springcloud这个接口需要调用远程服务
 * 2.1、声明接口的每一个方法都是调用哪个远程服务的哪个请求
 * 3、开启远程调用功能
 */
/**
 * 如何使用Nacos作为配置中心统一管理配置
 * 1、引入依赖 nacos-config
 * 2、创建一个bootstrap.properties文件，配置config.server-addr 地址
 * 3、需要在配置中心默认添加一个叫 数据集(Data Id) 应用名称.properties
 * 4、在 应用名称.properties 添加配置
 * 5、动态获取配置：
 * 使用 @RefreshScope 和 @Value  ： 动态获取并刷新配置
 *
 * 每个微服务创建自己的命名空间，使用配置分组区分环境，dev，test，prod
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }
}

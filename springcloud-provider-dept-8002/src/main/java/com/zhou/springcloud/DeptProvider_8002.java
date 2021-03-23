package com.zhou.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : DeptProvider_8001
 * @Description : 启动类
 * @Author : zhoul
 * @Date: 2021-03-14 23:37
 */
@SpringBootApplication
@EnableEurekaClient //服务启动后自动注册到eureka
@EnableDiscoveryClient //服务发现 可不写
public class DeptProvider_8002 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8002.class,args);
    }
}

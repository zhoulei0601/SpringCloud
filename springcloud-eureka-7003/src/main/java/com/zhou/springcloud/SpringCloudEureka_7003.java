package com.zhou.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName : SpringCloudEureka_7001
 * @Description : 启动类
 * @Author : zhoul
 * @Date: 2021-03-15 17:19
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEureka_7003 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEureka_7003.class,args);
    }
}

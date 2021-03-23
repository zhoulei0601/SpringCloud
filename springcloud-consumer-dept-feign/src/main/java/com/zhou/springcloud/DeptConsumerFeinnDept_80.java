package com.zhou.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : DeptConsumer_80
 * @Description : 启动类
 * @Author : zhoul
 * @Date: 2021-03-15 00:33
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.zhou.springcloud"})
public class DeptConsumerFeinnDept_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeinnDept_80.class,args);
    }
}

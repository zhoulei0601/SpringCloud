package com.zhou.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName : DeptConsumerHystrixDashboard
 * @Description :
 * @Author : zhoul
 * @Date: 2021-03-21 23:23
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableHystrixDashboard
public class DeptConsumerHystrixDashboard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerHystrixDashboard_9001.class,args);
    }

}

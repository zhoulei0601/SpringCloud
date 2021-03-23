package com.zhou.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName : SpringCloudZuul_9527
 * @Description :
 * @Author : zhoul
 * @Date: 2021-03-22 23:08
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableZuulProxy
public class SpringCloudZuul_9527 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuul_9527.class,args);
    }
}

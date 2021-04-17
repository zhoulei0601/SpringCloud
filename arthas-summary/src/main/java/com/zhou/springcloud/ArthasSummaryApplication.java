package com.zhou.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : DeptProvider_8001
 * @Description : 启动类
 * @Author : zhoul
 * @Date: 2021-03-14 23:37
 */
@SpringBootApplication
public class ArthasSummaryApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArthasSummaryApplication.class,args);
    }


}

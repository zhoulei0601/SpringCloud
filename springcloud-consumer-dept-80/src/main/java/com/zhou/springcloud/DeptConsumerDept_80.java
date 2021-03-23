package com.zhou.springcloud;

import com.zhou.rule.SelfRibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName : DeptConsumer_80
 * @Description : 启动类
 * @Author : zhoul
 * @Date: 2021-03-15 00:33
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
//微服务启动时，去加载自己自定义ribbon负载策略类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = SelfRibbonRule.class)
public class DeptConsumerDept_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDept_80.class,args);
    }
}

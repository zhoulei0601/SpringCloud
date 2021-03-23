package com.zhou.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName : ConfigBean
 * @Description : config
 * @Author : zhoul
 * @Date: 2021-03-15 00:21
 */
@Configuration
public class ConfigBean {

    @Bean
    //ribbon 配置负载均衡
    @LoadBalanced
    public RestTemplate gerRestTemplate(){
        return new RestTemplate();
    }
}

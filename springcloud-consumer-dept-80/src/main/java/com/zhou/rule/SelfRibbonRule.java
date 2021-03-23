package com.zhou.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : MyRule
 * @Description : 负载策略
 * @Author : zhoul
 * @Date: 2021-03-16 00:17
 */
@Configuration
public class SelfRibbonRule {

    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}

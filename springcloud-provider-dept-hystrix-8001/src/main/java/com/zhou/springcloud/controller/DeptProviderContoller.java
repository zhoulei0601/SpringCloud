package com.zhou.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhou.springcloud.pojo.Dept;
import com.zhou.springcloud.service.IDeptService;
import exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jetty.util.ajax.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName : DeptContoller
 * @Description : dept  测试服务熔断
 * @Author : zhoul
 * @Date: 2021-03-14 23:31
 */
@RestController
@Slf4j
public class DeptProviderContoller {
    @Autowired
    private IDeptService deptService;

    @HystrixCommand(fallbackMethod = "hystrixGet")
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) throws BusinessException {
        Dept dept = deptService.getById(id);
        if(dept == null){
            throw new BusinessException("未获取到该部门");
        }
        return dept;
    }

    public Dept hystrixGet(@PathVariable("id") Long id){
        log.info("hystrixGet id" + id);
        return new Dept().setDeptno(id).setDname("不存在该部门，hystrix").setDbSource("没有该数据库");
    }
}

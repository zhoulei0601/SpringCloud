package com.zhou.springcloud.controller;

import com.zhou.springcloud.pojo.Dept;
import com.zhou.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName : DeptController
 * @Description : controller
 * @Author : zhoul
 * @Date: 2021-03-15 00:11
 */
@RestController
public class DeptConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Resource
    private DeptClientService deptClientService = null;

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptClientService.get(id);
    }


}

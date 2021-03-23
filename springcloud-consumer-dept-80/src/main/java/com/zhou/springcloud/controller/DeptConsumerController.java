package com.zhou.springcloud.controller;

import com.zhou.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
  /**
   *ribbon 负载均衡，地址应该是个变量，通过服务名查找
   *private static final String REST_URL_PRIFIX = "http://localhost:8001";
   */
    private static final String REST_URL_PRIFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PRIFIX + "/dept/get/" + id,Dept.class);
    }

    @PostMapping("/consumer/dept/add")
    public boolean addDept(Dept dept){
        return restTemplate.postForObject(REST_URL_PRIFIX + "/dept/add",dept,Boolean.class);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> listDept(){
        return restTemplate.getForObject(REST_URL_PRIFIX + "/dept/list",List.class);
    }

}

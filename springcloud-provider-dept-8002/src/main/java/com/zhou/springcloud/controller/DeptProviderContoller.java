package com.zhou.springcloud.controller;

import com.zhou.springcloud.pojo.Dept;
import com.zhou.springcloud.service.IDeptService;
import org.eclipse.jetty.util.ajax.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName : DeptContoller
 * @Description : dept
 * @Author : zhoul
 * @Date: 2021-03-14 23:31
 */
@RestController
public class DeptProviderContoller {
    @Autowired
    private IDeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
        return  deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        id = 2L;
        return deptService.getById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> listDept(){
        return deptService.list();
    }

    @GetMapping("/dept/discovery")
    public Object discovery(){
        List<String> serivces = client.getServices();
        System.out.println(JSON.toString(serivces));
        List<ServiceInstance> serviceInstances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : serviceInstances) {
            System.out.println(JSON.toString(instance));
        }
        return client;
    }
}

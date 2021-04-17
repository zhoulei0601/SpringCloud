package com.zhou.springcloud.controller;

import com.zhou.springcloud.pojo.Dept;
import com.zhou.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
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


    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
        return  deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.getById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> listDept(){
        return deptService.list();
    }


    /***
    * @description 无限死循环
    * @Param []
    * @return void
    * @throws
    */
    @GetMapping("/dept/unlimitThread")
        public void unlimitThread(){
        deptService.unlimitThread();
    }

}

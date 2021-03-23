package com.zhou.springcloud.service;

import com.zhou.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName : DeptClientServiceFallbackFactory
 * @Description : 测试服务降级
 * @Author : zhoul
 * @Date: 2021-03-19 23:10
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return id -> new Dept().setDeptno(id).setDname("没有部门信息").setDbSource("没有该数据库");
    }
}

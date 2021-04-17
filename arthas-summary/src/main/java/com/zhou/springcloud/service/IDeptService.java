package com.zhou.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhou.springcloud.pojo.Dept;

public interface IDeptService extends IService<Dept> {
    boolean addDept(Dept dept);

    void unlimitThread();
}

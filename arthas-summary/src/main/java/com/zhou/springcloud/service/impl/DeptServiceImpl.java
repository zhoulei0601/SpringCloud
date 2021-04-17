package com.zhou.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhou.springcloud.mapper.DeptMapper;
import com.zhou.springcloud.pojo.Dept;
import com.zhou.springcloud.service.IDeptService;
import org.springframework.stereotype.Service;

/**
 * @ClassName : DeptServiceImpl
 * @Description :
 * @Author : zhoul
 * @Date: 2021-03-14 23:29
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {
    @Override
    public boolean addDept(Dept dept) {
        return baseMapper.addDept(dept);
    }

    @Override
    public void unlimitThread() {
        while (true){
            System.out.println("无线死循环----------");
        }
    }
}

package com.zhou.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhou.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptMapper extends BaseMapper<Dept> {
    boolean addDept(Dept dept);

    Dept getDept(Long id);

    List<Dept> listDept();
}

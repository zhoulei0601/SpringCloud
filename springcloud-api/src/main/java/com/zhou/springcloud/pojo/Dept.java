package com.zhou.springcloud.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName : com.zhou.springcloud.pojo.Dept
 * @Description : dept
 * @Author : zhoul
 * @Date: 2021-03-14 22:09
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long deptno;
    private String dname;
    private String dbSource;

    private Dept(String dname){
        this.dname = dname;
    }
}

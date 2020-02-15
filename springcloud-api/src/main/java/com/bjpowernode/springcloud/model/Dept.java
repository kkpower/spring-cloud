package com.bjpowernode.springcloud.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName Dept
 * @Description: TODO
 * @Author codemi@aliyun.com
 * @Date 2019/12/15
 **/
@Data
@NoArgsConstructor  //无参构造
@Accessors(chain = true)  //链式写法
public class Dept implements Serializable {

    private Integer deptno;
    private String dname;
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}

package com.bjpowernode.springclod.service;

import com.bjpowernode.springcloud.model.Dept;

import java.util.List;

/**
 * @ClassName DeptService
 * @Description: TODO
 * @Author 876666981@qq.com
 * @Date 2019/12/16
 **/

public interface DeptService {
    public Boolean addDept(Dept dept);

    public Dept queryDeptById(Integer id);

    public List<Dept> queryDeptAll();
}

package com.bjpowernode.springclod.service.impl;

import com.bjpowernode.springclod.mapper.DeptMapper;
import com.bjpowernode.springclod.service.DeptService;
import com.bjpowernode.springcloud.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DeptServiceImpl
 * @Description: TODO
 * @Author codemi@aliyun.com
 * @Date 2019/12/16
 **/

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept queryDeptById(Integer id) {
        return deptMapper.queryDeptById(id);
    }

    @Override
    public List<Dept> queryDeptAll() {
        return deptMapper.queryDeptAll();
    }
}

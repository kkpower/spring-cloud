package com.bjpowernode.springclod.mapper;

import com.bjpowernode.springcloud.model.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @ClassName DeptMapper
 * @Description: TODO
 * @Author 876666981@qq.com
 * @Date 2019/12/16
 **/
@Mapper
public interface DeptMapper {

     Boolean addDept(Dept dept);

     Dept queryDeptById(Integer id);

     List<Dept> queryDeptAll();
}

package com.bjpowernode.springcloud.service;

import com.bjpowernode.springcloud.model.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @ClassName DeptClientService
 * @Description: TODO
 * @Author 876666981@qq.com
 * @Date 2019/12/18
 **/

@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @GetMapping("/dept/get/list")
    List<Dept> queryAll();

    @GetMapping("/dept/get/{id}")
    Dept queryById(@PathVariable("id") Integer id);

    @PostMapping("/dept/add")
    Boolean addDept(Dept dept);
}

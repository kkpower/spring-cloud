package com.bjpowernode.springclod.controller;

import com.bjpowernode.springclod.service.DeptService;
import com.bjpowernode.springcloud.model.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName DeptController
 * @Description: TODO
 * @Author codemi@aliyun.com
 * @Date 2019/12/16
 **/
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @HystrixCommand(fallbackMethod = "hystrix")
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id){
        Dept dept = deptService.queryDeptById(id);
        if (dept == null){
            throw new RuntimeException("id=>"+id+"不存在");
        }
        return dept;
    }

    public Dept hystrix(@PathVariable("id") Integer id){
        return new Dept()
                .setDeptno(id)
                .setDname("id=>"+id+"没有对应的信息,null--@Hystrix")
                .setDb_source("no this database in MySQL");
    }
}

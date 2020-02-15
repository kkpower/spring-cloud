package com.bjpowernode.springclod.controller;

import com.bjpowernode.springclod.service.DeptService;
import com.bjpowernode.springcloud.model.Dept;
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

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public Boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id){
        return deptService.queryDeptById(id);
    }

    @GetMapping("/dept/get/list")
    public List<Dept> get(){
        return deptService.queryDeptAll();
    }

    //注册进来的微服务~ 获取一些信息
    @GetMapping("/dept/discovery")
    public Object discovery(){
        //获取微服务列表的清单
        List<String> servers = client.getServices();
        System.out.println("discovery=>services:"+servers);

        //得到一个具体的微服务信息，通过具体的微服务id，applicationName
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT-8001");
        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost()+"\t"+
                            instance.getPort()+"\t"+

                            instance.getInstanceId()
            );
        }
        return this.client;
    }
}

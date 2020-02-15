package com.bjpowernode.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName DeptConsumer_80_Application
 * @Description: TODO
 * @Author codemi@aliyun.com
 * @Date 2019/12/16
 **/

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.bjpowernode.springcloud.service"})
public class DeptConsumer_feign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_feign.class,args);
    }
}

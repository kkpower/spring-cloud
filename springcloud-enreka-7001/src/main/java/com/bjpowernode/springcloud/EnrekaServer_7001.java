package com.bjpowernode.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EnrekaApplication
 * @Description: TODO
 * @Author codemi@aliyun.com
 * @Date 2019/12/16
 **/

@SpringBootApplication
@EnableEurekaServer
public class EnrekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EnrekaServer_7001.class,args);
    }
}

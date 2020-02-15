package com.bjpowernode.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName Zuul_9527
 * @Description: TODO
 * @Author codemi@aliyun.com
 * @Date 2019/12/24
 **/

@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527 {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527.class,args);
    }
}

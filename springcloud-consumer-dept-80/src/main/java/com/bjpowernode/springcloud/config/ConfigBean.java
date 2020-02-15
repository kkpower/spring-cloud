package com.bjpowernode.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConfigBean
 * @Description: TODO
 * @Author codemi@aliyun.com
 * @Date 2019/12/16
 **/

@Configuration
public class ConfigBean {

    //实现负载均衡RestTemplate
    @Bean
    @LoadBalanced   //ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

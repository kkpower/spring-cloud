package com.bjpowernode.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyRule
 * @Description: TODO
 * @Author codemi@aliyun.com
 * @Date 2019/12/18
 **/

@Configuration
public class MyRule {

//    自定义的负载均衡
    @Bean
    public IRule iRule(){
        return new MyRandomRule();
    }
}

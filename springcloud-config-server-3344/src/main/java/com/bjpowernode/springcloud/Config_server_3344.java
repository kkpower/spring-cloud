package com.bjpowernode.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName Config_server_3344
 * @Description: TODO
 * @Author codemi@aliyun.com
 * @Date 2019/12/24
 **/

@SpringBootApplication
@EnableConfigServer
public class Config_server_3344 {
    public static void main(String[] args) {
        SpringApplication.run(Config_server_3344.class,args);
    }
}

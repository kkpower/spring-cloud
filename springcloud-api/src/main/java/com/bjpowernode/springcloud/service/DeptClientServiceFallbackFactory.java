package com.bjpowernode.springcloud.service;

import com.bjpowernode.springcloud.model.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName DeptClientServiceFallbackFactory
 * @Description: TODO
 * @Author codemi@aliyun.com
 * @Date 2019/12/23
 **/
//降级~
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public Dept queryById(Integer id) {
                return new Dept()
                        .setDeptno(id)
                        .setDname("id=>"+id+"没有对应的信息，客户端提供了降级的信息，这个服务已经被关闭~")
                        .setDb_source("没有数据~");
            }

            @Override
            public Boolean addDept(Dept dept) {
                return null;
            }
        };
    }
}

package com.nolva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 想要远程调用其他的服务
 * 1. 引入open-feign
 * 2. 编写一个接口，告诉Spring Cloud这个接口需要调用远程服务
 *    1.1 在接口声明需要远程调用的方法，以及请求的全路径
 * 3. 开启远程调用功能
 */
@EnableFeignClients(basePackages = "com.nolva.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class MallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
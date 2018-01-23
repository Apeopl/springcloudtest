package com.zjl.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/** 
* 描述：
* @author zhengjinlei 
* @version 2017年12月28日 下午3:23:47 
*/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceFeignApplication.class, args);
	}
}


package com.zjl.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/** 
* 描述：路由转发和过滤
* @author zhengjinlei 
* @version 2017年12月29日 上午10:00:28 
*/
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ServiceZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulApplication.class, args);
	}
}


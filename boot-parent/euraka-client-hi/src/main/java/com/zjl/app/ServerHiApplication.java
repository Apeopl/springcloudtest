package com.zjl.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** 
* 描述：服务提供者
* @author zhengjinlei 
* @version 2017年12月28日 下午1:55:39 
*/
@EnableEurekaClient
@SpringBootApplication
@RestController
public class ServerHiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServerHiApplication.class, args);
	}
	
	@Value("${server.port}")
	String port;
	
	@RequestMapping("/hi")
	public String test(@RequestParam String name){
		return "hi "+name+",i am from port:" +port;
	}
}


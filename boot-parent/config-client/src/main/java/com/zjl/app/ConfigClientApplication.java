package com.zjl.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
* 描述：
* @author zhengjinlei 
* @version 2017年12月29日 下午2:36:33 
*/
@SpringBootApplication
@RestController
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${jdbc.username}")
    String foo;
	
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}


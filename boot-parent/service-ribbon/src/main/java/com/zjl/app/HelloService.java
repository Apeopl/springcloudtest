package com.zjl.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/** 
* 描述：
* @author zhengjinlei 
* @version 2017年12月28日 下午2:37:50 
*/
@Service
public class HelloService {
	@Autowired
	RestTemplate restTemplate;
	@HystrixCommand(fallbackMethod = "hiError")
	public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
	
	public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
	}
}


package com.zjl.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** 
* 描述：
* @author zhengjinlei 
* @version 2017年12月28日 下午2:39:57 
*/
@RestController
public class HelloController {
	@Autowired
    HelloService helloService;
	
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}


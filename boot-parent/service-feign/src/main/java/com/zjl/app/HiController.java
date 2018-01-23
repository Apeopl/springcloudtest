package com.zjl.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** 
* 描述：
* @author zhengjinlei 
* @version 2017年12月28日 下午3:27:50 
*/
@RestController
public class HiController {
	@Autowired
	SchedualServiceHi schedualServiceHi;
	
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
	}
}


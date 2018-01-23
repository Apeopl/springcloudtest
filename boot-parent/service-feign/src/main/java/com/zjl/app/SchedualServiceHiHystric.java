package com.zjl.app;

import org.springframework.stereotype.Component;

/** 
* 描述：
* @author zhengjinlei 
* @version 2017年12月28日 下午4:49:36 
*/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}

}


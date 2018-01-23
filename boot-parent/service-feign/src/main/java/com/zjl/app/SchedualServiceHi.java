package com.zjl.app;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/** 
* 描述：
* @author zhengjinlei 
* @version 2017年12月28日 下午3:25:52 
*/
@FeignClient(value="service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}


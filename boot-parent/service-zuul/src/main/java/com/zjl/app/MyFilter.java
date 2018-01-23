package com.zjl.app;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/** 
* 描述：过滤器
* @author zhengjinlei 
* @version 2017年12月29日 上午10:24:51 
*/
@Component
public class MyFilter extends ZuulFilter {
	
	private static Logger log = LoggerFactory.getLogger(MyFilter.class);

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURI().toString()));
		String accessToken = request.getParameter("token");
		if(null == accessToken){
			log.warn("token is empty");
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(401);
			try {
				ctx.getResponse().getWriter().write("token is empty");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		log.info("ok");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return false;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}


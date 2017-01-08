package com.zmb.core.demo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.zmb.api.demo.entity.User;
import com.zmb.api.demo.service.DemoApiService;

@RequestMapping(value="/client")
@Controller
public class TestController {
	
	private static final Log log = LogFactory.getLog(TestController.class);

	 @Autowired
	private DemoApiService demoApiService;
	/**
	 * h5支付测试
	 * @return
	 */
	@RequestMapping(value="getUserInfo.do" )
	public String getUserInfoById(String userId){
		log.info("接收测试请求！,userid:"+userId);
		
		User user = demoApiService.getUserInfoById(userId);

		
		log.info("调用dubbo获取用户信息："+JSON.toJSONString(user));
		return "{aaa:bbb}";
	}
	

	
}

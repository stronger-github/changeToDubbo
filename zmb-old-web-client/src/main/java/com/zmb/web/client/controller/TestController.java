package com.zmb.web.client.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zmb.api.demo.entity.User;
import com.zmb.api.demo.service.Demo2ApiService;
import com.zmb.api.demo.service.DemoApiService;

@RequestMapping(value="/client")
@Controller
public class TestController {
	
	private static final Log log = LogFactory.getLog(TestController.class);

	 @Autowired
	private DemoApiService demoApiService;
	 
	 @Autowired
	private Demo2ApiService demo2ApiService;
	/**
	 * h5支付测试
	 * @return
	 */
	@RequestMapping(value="getUserInfoById.do" )
	@ResponseBody
	public String getUserInfoById(String userId){
		log.info("接收http测试请求！,userid:"+userId);
		
		log.info("作为消费者向提供者发出请求,userid:"+userId);
		
		User user = demoApiService.getUserInfoById(userId);

		
		log.info("调用dubbo获取用户信息："+JSON.toJSONString(user));
		return "{aaa:bbb}";
	}
	
	
	/**
	 * h5支付测试
	 * @return
	 */
	@RequestMapping(value="getUserInfoByName.do" )
	@ResponseBody
	public String getUserInfoByName(String userName){
		log.info("接收http测试请求！,userName:"+userName);
		
		log.info("作为消费者向提供者发出请求,userName:"+userName);
		
		User user = demo2ApiService.getUserInfoByName(userName);

		
		log.info("调用dubbo获取用户信息："+JSON.toJSONString(user));
		return "{aaa:bbb}";
	}

	
}

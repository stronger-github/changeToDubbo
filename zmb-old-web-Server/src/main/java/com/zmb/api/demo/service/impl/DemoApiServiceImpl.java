package com.zmb.api.demo.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmb.api.demo.entity.User;
import com.zmb.api.demo.service.DemoApiService;
import com.zmb.core.demo.service.app.DemoAppService;

@Service("demoApiService")
public class DemoApiServiceImpl implements DemoApiService {

	private static final Log log = LogFactory.getLog(DemoApiServiceImpl.class);
	
	@Autowired
	private DemoAppService demoAppService;
	
	
	@Override
	public User getUserInfoById(String userId) {
		log.info("收到dubbo消费者调用，userId:"+userId);
		
		
		return demoAppService.getUserInfoById(userId);
	}
	
	

}

package com.zmb.api.demo.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmb.api.demo.entity.User;
import com.zmb.api.demo.service.Demo2ApiService;
import com.zmb.core.demo.service.app.Demo2AppService;

@Service("demo2ApiService")
public class Demo2ApiServiceImpl implements Demo2ApiService {

	private static final Log log = LogFactory.getLog(Demo2ApiServiceImpl.class);
	
	@Autowired
	private Demo2AppService demo2AppService;

	@Override
	public User getUserInfoByName(String name) {
		log.info("收到dubbo消费者调用，name:"+name);
		return demo2AppService.getUserInfoByName(name);
	}
	
	

	
	

}

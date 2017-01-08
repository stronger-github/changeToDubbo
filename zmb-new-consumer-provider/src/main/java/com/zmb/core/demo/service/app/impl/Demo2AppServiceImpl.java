package com.zmb.core.demo.service.app.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmb.api.demo.entity.User;
import com.zmb.api.demo.service.DemoApiService;
import com.zmb.api.demo.service.impl.Demo2ApiServiceImpl;
import com.zmb.core.demo.service.app.Demo2AppService;

@Service
public class Demo2AppServiceImpl implements Demo2AppService{

	@Autowired
	private DemoApiService demoApiService;

	private static final Log log = LogFactory.getLog(Demo2ApiServiceImpl.class);
	
	@Override
	public User getUserInfoByName(String name) {
		
		log.info("提供者内部app层处理，name:"+name);
		log.info("作为消费者转发其他消费者，userid:"+11111);
		
		return demoApiService.getUserInfoById("11111");
	}




}

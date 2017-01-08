package com.zmb.core.demo.service.app.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmb.api.demo.entity.User;
import com.zmb.api.demo.service.impl.DemoApiServiceImpl;
import com.zmb.core.demo.service.app.DemoAppService;
import com.zmb.core.demo.service.base.UserService;
 
@Service
public class DemoAppServiceImpl implements DemoAppService{

	private static final Log log = LogFactory.getLog(DemoApiServiceImpl.class);
	
	@Autowired
	private UserService userService;
	
	@Override
	public User getUserInfoById(String userId) {
		log.info("提供者内部app层处理，userId:"+userId);
		return userService.getUserInfoById(userId);
	}

}

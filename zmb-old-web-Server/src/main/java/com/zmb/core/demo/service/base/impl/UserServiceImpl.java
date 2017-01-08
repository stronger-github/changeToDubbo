package com.zmb.core.demo.service.base.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.zmb.api.demo.entity.User;
import com.zmb.core.demo.service.base.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Log log = LogFactory.getLog(UserServiceImpl.class);
	
	@Override
	public User getUserInfoById(String userId) {
		log.info("提供者内部base层处理，userId:"+userId);
		
		User user = new User();
		user.setName("测试姓名");
		
		log.info("返回用户数据："+JSON.toJSONString(user));
		return user;
	}

}

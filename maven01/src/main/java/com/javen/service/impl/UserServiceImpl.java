package com.javen.service.impl;

import com.javen.dao.IUserDao;
import com.javen.model.User;
import com.javen.service.IUserService;

public class UserServiceImpl  implements IUserService{
private IUserDao userDao;
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}

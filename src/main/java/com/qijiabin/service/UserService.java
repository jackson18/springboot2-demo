package com.qijiabin.service;

import com.qijiabin.dao.UserDao;
import com.qijiabin.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserDao userDao;

	@Transactional
	public int insertUser(String name, Integer age) {
		User user = new User();
		user.setName(name);
		user.setAge(age);
		int insertUserResult = userDao.insert(user);
		log.info("UserService,insertUserResult:{}", insertUserResult);
		return insertUserResult;
	}

}
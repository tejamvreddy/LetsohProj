package com.letsoh.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.letsoh.dao.LetsohUserDAO;
import com.letsoh.model.LetsohUser;
import com.letsoh.service.LetsohUserService;

@Service
public class LetsohUserServiceImpl implements LetsohUserService{
	
	public LetsohUserDAO letsohUserDao;
	
	@Override
	public List<LetsohUser> getAllUsers() {
		System.out.println("inside Serverice :: getAllusers Meth");
		
		List<LetsohUser> userList = null;
		try {
			userList= letsohUserDao.getAllUsers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userList;
	}
	
	

	public LetsohUserDAO getLetsohUserDao() {
		return letsohUserDao;
	}

	public void setLetsohUserDao(LetsohUserDAO letsohUserDao) {
		this.letsohUserDao = letsohUserDao;
	}

	

	
	

}

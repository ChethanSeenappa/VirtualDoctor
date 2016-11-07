package com.virtualdoctor.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtualdoctor.dao.UserDAO;
import com.virtualdoctor.model.User;
import com.virtualdoctor.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
    @Override
	@Transactional
	public void addUser(User user) {
		this.userDAO.addUser(user);
		
	}
    @Override
	@Transactional
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}
    @Override
	@Transactional
	public Object getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
    @Override
	@Transactional
	public Object listUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

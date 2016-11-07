package com.virtualdoctor.service;

import com.virtualdoctor.model.User;

public interface UserService {
	public void addUser(User user);
	public void updateUser(User user);
	public Object getUserById(int id);
	public Object listUsers();
	
}

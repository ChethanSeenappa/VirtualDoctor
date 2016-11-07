package com.virtualdoctor.dao;



import com.virtualdoctor.model.User;

public interface UserDAO {
	public void addUser(User user);
	public void updateUser(User user);
	public Object getUserById(int id);
	public Object listUsers();

}

package com.sence.dao;

import java.util.List;

import com.sence.entity.User;

public interface IUserDao {
	public void AddUser(User user);
	public void modifyUser(User user);
	public void deleteUser(User user);
	
	public List<User> getAllUser();
	public User getUser(String name,String password);
}

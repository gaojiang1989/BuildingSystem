package com.sence.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sence.entity.User;

public class UserDaoImp implements IUserDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void AddUser(User user) {
		System.out.println("-------UserDaoImp.AddUser-----------"
				+ user.getName());
		getSession().save(user);
		List<User> list = getAllUser();
		System.out.println("�ܹ����û���"+list.size());
	}

	@Override
	public void modifyUser(User user) {
		System.out.println("-------UserDaoImp.modifyUser-----------"
				+ user.getName());
		getSession().update(user);
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("-------UserDaoImp.deleteUser-----------"
				+ user.getName());
		getSession().delete(user);
	}

	@Override
	public List<User> getAllUser() {
		List<User> list = getSession().createQuery("from User").list();
		
		return list;
	}

	@Override
	public User getUser(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}

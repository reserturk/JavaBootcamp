package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import bussiness.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	
	

	
	ArrayList<User> users = new ArrayList<>();
	


	@Override
	public void add(User user) {
		
		users.add(user);
	}

	@Override
	public List<User> getAll() {
	
		return users;
	}




}

package bussiness.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	
	void servisAdd(User user);
	void login(User user);
	List<User> servisGetAll();

}

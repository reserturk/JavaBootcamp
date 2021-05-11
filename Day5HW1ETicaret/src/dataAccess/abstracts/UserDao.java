package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	
	List<User> getAll();

}

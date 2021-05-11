package bussiness.abstracts;

import entities.concretes.User;

public interface ValidationService {
	
	boolean valiName(User user);
	boolean valiPassword(User user);
	boolean valiEMail(User user);
	boolean valiMailConfirm(User user);
	boolean sendEMail(User user);

}

import java.util.List;

import bussiness.abstracts.UserService;
import bussiness.abstracts.ValidationService;
import bussiness.concretes.UserManager;
import bussiness.concretes.ValidationManager;
import core.concretes.GmailAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
	
			User user = new User(1,"res","ert","res@gmail.com","resres");
			
			UserManager userManager= new UserManager(new HibernateUserDao(), new ValidationManager());

			userManager.servisAdd(user);
			userManager.login(user);
	}

}

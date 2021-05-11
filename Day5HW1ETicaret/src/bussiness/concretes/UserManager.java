package bussiness.concretes;

import java.util.List;

import bussiness.abstracts.UserService;
import bussiness.abstracts.ValidationService;
import core.abstracts.GmailService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;

	private ValidationService valiService;
	

	public UserManager(UserDao userDao, ValidationService valiService) {
		super();
		this.userDao = userDao;
		
		this.valiService = valiService;
		
	}

	

	@Override
	public void servisAdd(User user) {
		
		if(valiService.valiEMail(user) && valiService.valiMailConfirm(user)&& valiService.valiName(user)&&valiService.valiPassword(user))
		{
			userDao.add(user);
			System.out.println("Kullan�c� Ba�ar�l� �ekilde Eklendi. : "+ user.getAd()+" "+user.getSoyad());
		}
		
	}

	@Override
	public List<User> servisGetAll() {
		for (User user : userDao.getAll()) {
			System.out.println("ID'li :" + user.getuId()+ " Ad� : "+ user.getAd()+ " Soyad�: "+ user.getSoyad()+ " Email : "+ user.geteMail());
			
		}
		
		return userDao.getAll();
	}

	@Override
	public void login(User user) {
		for (User users : this.servisGetAll()) {
			if(users.geteMail()==user.geteMail()&&users.getPassword()==user.getPassword()) {
				
				System.out.println("Giri� Ba�ar�l�");
			}else {System.out.println("Email veya Password hatal� l�tfen tekrar deneyiniz.");}
		}
		
		
	}

}

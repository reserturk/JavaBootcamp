package bussiness.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bussiness.abstracts.ValidationService;

import entities.concretes.User;

public class ValidationManager implements ValidationService{
	/*
	private GmailService gmailService;
	

	public ValidationManager(GmailService gmailService) {
		super();
		this.gmailService = gmailService;
	}
*/
	@Override
	public boolean valiName(User user) {
		if(!user.getAd().isEmpty() & !user.getSoyad().isEmpty()) {
			return true;
		}
		System.out.println("�sim ve Soyisim bo� b�rak�lamaz.");
		return false;
		
	}

	@Override
	public boolean valiPassword(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("�ifreniz 6 karakter ve �st� olmak zorundad�r.");
			return false;
		}
		
		return true;
	}

	@Override
	public boolean valiEMail(User user) {
		String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
		CharSequence inputEmail = user.geteMail();
		
		Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputEmail);
		boolean result = matcher.matches();
		if(result == true) {
			
			return true;
		}
		System.out.println("E-Mail adresinizi do�ru formatta giriniz.");
		return false;
	}
	@Override
	public boolean sendEMail(User user) {
		/*if(user.getVerified()==true) {
			gmailService.honest(user);
			return true;
		}*/
		return true;
	}

	@Override
	public boolean valiMailConfirm(User user) {
		
		if(valiName(user) & valiPassword(user) & valiEMail(user)& sendEMail(user)==true) {
			System.out.println("Giri� Yap�ld�");
			return true;
			
		}
	return false;
	}

	

}

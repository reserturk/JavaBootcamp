package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity{
	
	int uId;
	String ad;
	String soyad;
	String eMail;
	String password;
	
	
	public User() {
		super();
	}

	public User(int uId, String ad, String soyad, String eMail, String password) {
		super();
		this.uId = uId;
		this.ad = ad;
		this.soyad = soyad;
		this.eMail = eMail;
		this.password = password;
		
	}


	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

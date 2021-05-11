package camp3HwJava;

public class User {
		int UId;
		String eMail;
		String password;
		
		public User() {
			
		}
		

		public User(int uId, String eMail, String password) {
			super();
			UId = uId;
			this.eMail = eMail;
			this.password = password;
		}


		public int getUId() {
			return UId;
		}

		public void setUId(int uId) {
			UId = uId;
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

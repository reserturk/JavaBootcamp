package camp3HwJava;

public class Instructor extends User {
	
	int IId;
	int userId;
	String firstName;
	String lastName;
	
	public Instructor() {}
	
	public Instructor(int iId, int userId, String firstName, String lastName) {
		super();
		IId = iId;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getIId() {
		return IId;
	}

	public void setIId(int iId) {
		IId = iId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return firstName + lastName;
	}

}

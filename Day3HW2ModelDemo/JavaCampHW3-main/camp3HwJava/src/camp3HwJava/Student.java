package camp3HwJava;

public class Student extends User {

	private int SId;
	private int userId;
	private String firstName;
	private String lastName;
	
	public Student() {}
	
	public Student(int sId, int userId, String firstName, String lastName) {
		
		SId = sId;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getSId() {
		return SId;
	}

	public void setSId(int sId) {
		SId = sId;
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
}

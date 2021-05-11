package entities;

public class Gamer {

	private int id;
	private String firtsName;
	private String lastName;
	private Long nationalityId;
	private int yearOfBirth;
	
	public Gamer() {
		super();
	}
	public Gamer(int id, String firtsName, String lastName, Long nationalityId, int yearOfBirth) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.yearOfBirth = yearOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(Long nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
}

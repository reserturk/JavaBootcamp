package Entities;
import java.time.LocalDate;
import java.util.Date;

import Abstract.Entity;

public class Customer implements Entity {
	
	int Id;
	String firstName;
	String lastName;
	LocalDate DateOfBirth;
	Long nationalityId;
	public Customer() {
		super();
	}
	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, Long nationalityId) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		DateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.DateOfBirth = dateOfBirth;
	}
	public Long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(Long nationalityId) {
		this.nationalityId = nationalityId;
	}


}

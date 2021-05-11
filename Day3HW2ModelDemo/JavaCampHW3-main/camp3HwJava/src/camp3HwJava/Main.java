package camp3HwJava;

public class Main {

	public static void main(String[] args) {
	
		User res = new User(1,"dsa@gmail.com","1234");
		UserManager userManager = new UserManager();
		userManager.Register(res);
		
		Student ayjan = new Student();
		ayjan.setSId(2);
		ayjan.setFirstName("Ayjan");
		ayjan.setLastName("Jama");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(ayjan);
		
		Instructor instructor = new Instructor(3,1,"engin","Demirog");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.update(instructor);
		
		Corporate corporate = new Corporate(1,2,"fas");
		
		
		ComporateManager corparateManager = new ComporateManager();
		corparateManager.delete(corporate);
		
			
		

	}

}

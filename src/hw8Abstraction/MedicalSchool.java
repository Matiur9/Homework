package hw8Abstraction;

public abstract class MedicalSchool {
	// we can create constructor inside medical school abstract class
	public MedicalSchool() {
		System.out.println("student can study medicine inside medical school");
	}
	public abstract void anatomyLab();
	
	// non abstract method
	public void boichemistryLab() {
		System.out.println("You can do chemist experiment in this lab");
	}
 
}

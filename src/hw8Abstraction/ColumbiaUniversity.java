package hw8Abstraction;

public abstract  class ColumbiaUniversity {
	// we can not create abstract method inside regular class 
	// but I think we can instantiate the class and implements the methods
	//we can create constructor inside regular class
	public ColumbiaUniversity() {
		System.out.println("Top University in NY");
	}
	public abstract void chemistry();

	public void biology() {
	System.out.println("Biology is under science");
  }
}
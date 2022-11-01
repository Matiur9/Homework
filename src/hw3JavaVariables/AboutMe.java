package hw3JavaVariables;

public class AboutMe {

	String myName = "Matiur Rahman Khan"; // intialized

	byte age = 27;
	short myCarInsurance = 24678;
	int myMonthlySalary = 87547252;
	long myAccountBalance = 84747583934l;
	float myHeight = 1.7465f;
	double myCgpa = 3.7664794;
	char myGender = 'M';
	boolean usCitizen = true;

	public static void main(String[] args) {

		AboutMe alex = new AboutMe();
		System.out.println(alex.myName);
		System.out.println("My Name:" + alex.myName);
		System.out.println(alex.age);
		System.out.println(alex.myGender);
		System.out.println(alex.myHeight);
		System.out.println("My Name:" + alex.myName + ",My Age:" + alex.age + ",My Gender:" + alex.myGender);

	}

}

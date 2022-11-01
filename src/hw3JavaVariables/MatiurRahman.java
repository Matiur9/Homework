package hw3JavaVariables;

public class MatiurRahman {

	public String myName = "Matiur Rahman Khan"; // intialized

	public byte age = 27;

	public short myCarInsurance = 24678;

	public int myMonthlySalary = 87547252;

	public long myAccountBalance = 84747583934l;
	public float myHeight = 1.7465f;
	public double myCgpa = 3.7664794;

	public char myGender = 'M';

	public boolean usCitizen = true;

	public static void main(String[] args) {

		MatiurRahman matiurRahman = new MatiurRahman();
		System.out.println(matiurRahman.myName);
		System.out.println("My Name:" + matiurRahman.myName);
		System.out.println(matiurRahman.age);
		System.out.println(matiurRahman.myGender);
		System.out.println(matiurRahman.myHeight);
		System.out.println("My Name:" + matiurRahman.myName + ",My Age:" + matiurRahman.age + ",My Gender:"
				+ matiurRahman.myGender);
		// TODO Auto-generated method stub

	}

}

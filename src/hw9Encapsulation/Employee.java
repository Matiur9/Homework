package hw9Encapsulation;

import java.awt.image.AbstractMultiResolutionImage;

public class Employee {
	private String myName;
	private int myAge;
	private char sex;
	private Boolean myusCitizen;
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public int getMyAge() {
		return myAge;
	}
	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Boolean getMyusCitizen() {
		return myusCitizen;
	}
	public void setMyusCitizen(Boolean myusCitizen) {
		this.myusCitizen = myusCitizen;
	}
}
package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
	Employee employee = new Employee();
	employee.setMyName("Alex");
	employee.setMyAge(71);
	employee.setSex('M');
	employee.setMyusCitizen(true);
	
	System.out.println("Employee Name: "+employee.getMyName()+ ",\nAge:"+employee.getMyAge()+",\nSex:"+employee.getSex()+",\nCitizen:"+employee.getMyusCitizen());
	}

}

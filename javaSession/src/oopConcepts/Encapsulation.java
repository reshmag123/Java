package oopConcepts;

public class Encapsulation {
	
	// Also called Data Hiding 
	//need to use public getter and setter methods to access the private variables
	//reusable flexible secure
	//Implementation details are hidden
	//Its not compulsory to define the getter and setter If you want more security then make it as a private only
	//In case of read only you can define the getters not setter
	
	private int empId;
	private String EmpName;
	private int age;
	

	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return EmpName;
	}


	public void setEmpName(String empName) {
		EmpName = empName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
		
		Encapsulation ep = new Encapsulation();
		
		ep.setAge(29);
		ep.setEmpId(34678);
		ep.setEmpName("Joe");
		
		System.out.println("Employee name :" + ep.getEmpName());
		System.out.println("Employee Id :" + ep.getEmpId());
		System.out.println("Employee age :" + ep.getAge());
	}

}

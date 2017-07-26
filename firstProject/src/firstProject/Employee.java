package firstProject;

 public abstract class Employee {
int id;
String name;
String designation;
String phone;
	
	
	public Employee(int id, String name, String designation, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.phone = phone;
	}

public abstract void calculateSalary();
	


}


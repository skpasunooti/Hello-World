package firstProject;

public class contractEmployee extends Employee {
String projectEndDate;

public contractEmployee(int id, String name, String designation, String phone, String projectEndDate) {
	super(id, name, designation, phone);
	this.projectEndDate = projectEndDate;
}
public void calculateSalary(){
	
}


}

package firstProject;

public class permanentEmployee extends Employee{
String joingDate;

public permanentEmployee(int id, String name, String designation, String phone, String joingDate) {
	super(id, name, designation, phone);
	this.joingDate = joingDate;
}
@Override
public void  calculateSalary(){
	System.out.println("***permanent employee salary:*****");
}
}

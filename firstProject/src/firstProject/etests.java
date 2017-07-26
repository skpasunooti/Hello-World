package firstProject;

public class etests {

	public static void main(String[] args) {
		permanentEmployee employee = new permanentEmployee(123, "Hary", "UI", "+1458791", "01jan");
  employee.calculateSalary();
  System.out.println("employee name:"+ employee.name);
	}

}

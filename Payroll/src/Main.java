/***
 * @author Divyaprakash
 */
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Organization org = new Organization("Metacube");
		Payroll p1 = new Payroll(5, 250000);
		
		Department admin = new Department("Admin", 101);
		Department finance = new Department("Finance", 102);
		
		org.addDepartment(finance);
		org.addDepartment(admin);
		
		Employee emp1 = new Employee("Rahul", 1001, 15500, 25000, 4500);
		Employee emp2 = new Employee("Kamal", 1002, 15000, 25000, 6000);
		Employee emp3 = new Employee("Kartik",1003, 16500, 30000, 8000);
		Employee emp4 = new Employee("Divya", 1004, 17000, 25000, 2000);
 		
		admin.join(emp1);
		admin.join(emp4);
		admin.join(emp2);
		
		admin.relieve(emp4);
		admin.relieve(emp3);
		
		finance.join(emp4);
		finance.join(emp3);
		
		org.addDepartment(finance);
		
		List<Employee> employeeAdmin = admin.getEmployees();
		List<Employee> employeeFinance = finance.getEmployees();
		
		System.out.println("Department Id for employee "+ emp1.getName()+ " is "+emp1.getDepId());
		
		System.out.println("Departments in organization " + org.getOrganizationName());
		org.showAllDepartment();
		
		System.out.println("Employee in department " + admin.getName());
		org.showAllEmployee(employeeAdmin);
		
		System.out.println("Employee in department " + finance.getName());
		org.showAllEmployee(employeeFinance);
		
		System.out.println("List of all employees");
		org.showAllEmployee(org.getAllEmployees());
		
		org.printAllSalary(p1);
	}
}

/***
 * This is an organization class which can have multiple departments and employees
 * This class help in generating salary slips for all employees
 */
import java.util.ArrayList;
import java.util.List;

public class Organization{
	private final String organizationName;
	private static List<Department> allDepartment;
	private static List<Employee> allEmployees;
	
	Organization(String name){
		 organizationName = name;
		 allDepartment = new ArrayList<Department>();
		 allEmployees = new ArrayList<Employee>();
		 }
	
	public String getOrganizationName() {
		return organizationName;
	}
	
	/**
	 * Add department to organization
	 * 
	 * @param departmentName
	 * @return true if department added successfully or false if department already added
	 */
	public boolean addDepartment(Department departmentName)
	{	
		if(allDepartment.contains(departmentName)){
			System.out.println(" Department already added ");
			return false;
		}
		allDepartment.add(departmentName);
		return true;
	}
	
	/**
	 * Return list of all employees in an organization of any department
	 * @return allEmployees
	 */
	public List<Employee> getAllEmployees(){
		for(Department d:allDepartment){
			for(Employee e: d.getEmployees())
			{
				addEmployee(e);
			}
		}
		return allEmployees;
	}
	
	/**
	 * Display id and name of all department in an organization
	 */
	public void showAllDepartment(){
		for(Department d : allDepartment){
			System.out.println(d.getId() + " | " + d.getName());
		}
	}
	
	/**
	 * Display details of all employees in an organization
	 * @param empList
	 */
	public void showAllEmployee(List<Employee> empList){
		System.out.println("ID   |  NAME    |   SALARY  |   BONUS  |  COMPENSATION " );
		for(Employee e : empList)
		{
			e.show();
		}
	}

	/**
	 * Diplay salary slip for all employee in an organization
	 * @param p1
	 */
	public void printAllSalary(Payroll p1) {
		for(Employee e:getAllEmployees()){
			p1.printSalarySlip(e);
		}
	}
	

	/**
	 * Add employee to allEmployee list of organization
	 * @param e
	 */
	public void addEmployee(Employee e){
		if(!allEmployees.contains(e))
			allEmployees.add(e);
	}
	
}

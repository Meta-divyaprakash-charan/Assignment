/***
 * @author Divyaprakash 
 */
import java.util.ArrayList;
import java.util.List;

public class Department{
	private int departmentId;
	private String name;
	private List<Employee> employeeList;
	
	/* Parameterized constructor to initialize object of Department class*/	
	public Department(String name, int id) {
		this.setName(name);
		this.departmentId = id;
		employeeList = new ArrayList<Employee>();
	}
	
	/* Getter setter for department name*/
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return departmentId;
	}
	
	/**
	 * Add object of employee class to employeeList of department class
	 * 
	 * @param newEmployee
	 * @return true if new employee is added or false if employee already exist
	 */
	public boolean join(Employee newEmployee){
		if(employeeList.contains(newEmployee)){
			System.out.println("Employee already in same department");
			return false;
		}
		employeeList.add(newEmployee);
		newEmployee.setDepId(departmentId);
		return true;
	}
	

	/**
	 * remove object of employee class from employeeList of department class
	 * 
	 * @param employee
	 * @return true if employee is removed or false if employee not found
	 */
	public boolean relieve(Employee employee){
		if(employeeList.contains(employee)){
			employeeList.remove(employee);
			employee.setDepId(0);
			return true;
		}
		System.out.println("Employee not in this department");
		return false;
	}
	
	/**
	 * Generate list of all employee in a department
	 * @return employeeList
	 */
	public List<Employee> getEmployees(){
		 return this.employeeList;
	}}

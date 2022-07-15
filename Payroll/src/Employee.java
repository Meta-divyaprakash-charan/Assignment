/***
 * 
 * @author Divyaprakash
 *
 */
public class Employee{
	private int emp_id;
	private String name;
	private double salary;
	private double bonus;
	private double compensation;
	private int depId;
	
	Employee(){	
	}
	
    Employee(String name, int id, double sal, double bonus, double comp){
    	this.name = name;
    	this.setEmp_id(id);
    	this.salary = sal;
		this.bonus = bonus;
		this.compensation = comp;
		setDepId(0);
	}
		
    /* Setter and getter method to initialize and get values of private variables*/
    
    public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
    
	public void setName(String name) {
		this.name = name;
	}	

	public void setSalary(double salary){
		this.salary = salary;
	}	
	
	public void setBonus(double bonus){
		this.bonus = bonus;
	}
	
	public void setCompensation(double comp){
		this.compensation = comp;
	}		
	
	public double getBasicSalary(){
		return salary;
	}

	public double getBonus(){
		return bonus;
	}

	public double getCompensation(){
		return compensation;
	}

	public int getEmp_id() {
		return emp_id;
	}
	
	public String getName(){
		return name;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public void show() {
		System.out.print(emp_id+" |   "+name+"  |  "+salary+"  |  "+bonus+" |   "+compensation+"\n");
	}
}

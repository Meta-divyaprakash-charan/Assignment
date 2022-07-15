/**
 * This is payroll class which can calculate tax for every employee
 * This class print salary slips for all employees
 * 
 * @author Divyaprakash
 *
 */
public class Payroll{
	private static double taxRate;
	private static double minTaxableAmount;
	private double annualSalary;
	private double grossSalary;
	private double annualCompensation;

	Payroll(double rate, double min){
		taxRate = rate;
		minTaxableAmount = min;
	}
	
		/**
		 * Calculate tax of an employee 
		 * 
		 * @param emp
		 * @return tax 
		 */
	    public double calculateTax(Employee emp){
		double tax = 0;
		annualSalary = 12*emp.getBasicSalary();
		annualCompensation = 12*emp.getCompensation();
		grossSalary =  annualSalary+annualCompensation+emp.getBonus();
		if(grossSalary>=minTaxableAmount){
			tax = (grossSalary*taxRate)/100;		
			}
		return tax;
	}
	    
	/**
	 * Print salary slip for an employee
	 * 
	 * @param emp
	 * @return true if salary slip printed successfully
	 */
	public boolean printSalarySlip(Employee emp){
		double tax = calculateTax(emp);
        System.out.println( "		Salary slip   	  \n");
        System.out.println("Employee Name: " + emp.getName() + "\t Employee ID: "+emp.getEmp_id());
		System.out.println("Basic salary   : " + emp.getBasicSalary());
		System.out.println("Compensation   : " + emp.getCompensation());
		System.out.println("Bonus          : " + emp.getBonus());
		System.out.println("Taxable amount : " + (annualSalary));
		System.out.println("Gross salary   : " + grossSalary);
		System.out.println("Tax amount     : " + tax);
		double net = (grossSalary-tax)/12;
		System.out.println("Net pay        : " + net);
		System.out.println();
		return true;
	}
}

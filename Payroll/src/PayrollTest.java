/***
 * This is a junit test class for payroll class
 * This class runs different test cases for different functions 
 
 * @author Divyaprakash
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PayrollTest {
	Payroll p1 = new Payroll(5, 200000);
	Employee emp1 = new Employee("Kamal", 101, 15000, 20000, 800);
	Employee emp2 = new Employee("Rajat", 102, 12500, 2500, 100);
	
	/**
	 * Test function case 1 for calculateTax() function in payroll class
	 */
	@Test
	void testCalculateTax(){
		assertEquals(10480.0,p1.calculateTax(emp1));
	}
	
	/**
	 * Test function case 2 for calculateTax() function in payroll class
	 * Tax is 0 for annualSalary < minTaxable amount
	 */
	@Test
	void testCalculateTax2(){
		assertEquals(0,p1.calculateTax(emp2));
	}

	/**
	 * Test function for printSalarySlip() in payroll class
	 */
	@Test
	void testPrintSalary(){
		assertEquals(true, p1.printSalarySlip(emp1));
	}
}

/**
 * This file is a junit test class for Department class 
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestDepartment {
	Department dept1 = new Department("Admin", 101);
	Employee emp1 = new Employee("Kajal", 103, 15000, 20000, 800);
	Employee emp2 = new Employee("Ankit", 104, 14500, 25000, 1000);
	
	
	/**
	 * Test function for join() function
	 */
	@Test
	void testDeptJoin1(){
		assertEquals(true, dept1.join(emp1));
	}
	
	@Test
	void testDeptJoin2(){
		dept1.join(emp2);
		assertEquals(false, dept1.join(emp2));
	}
	
	/**
	 * Test function for relieve() function 
	 */
	@Test
	void testDeptRelieve(){
		dept1.join(emp1);
		assertEquals(true, dept1.relieve(emp1));
	}
}

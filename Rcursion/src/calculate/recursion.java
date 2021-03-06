/***
 * 
 * @author Divyaprakash
 *
 */
package calculate;
public class recursion{
	/**
	 * Specification
	 * -Calculate LCM of two numbers 
	 * 
	 * @param num1
	 * @param num2
	 * 
	 * @return int lcm
	 */
	int LCM(int num1, int num2){
		int lcm = (num1*num2)/HCF(num1,num2);
		return lcm;
	}
	
	/**
	 * Specification
	 * -Calculate HCF of two numbers
	 * 
	 * @param num1
	 * @param num2
	 * 
	 * @return int num1
	 */
	
	int HCF(int num1, int num2){
		if(num2==0)
			return num1;
		return HCF(num2,num1%num2);
	}
}

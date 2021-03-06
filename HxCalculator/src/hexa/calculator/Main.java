/*HexCalc is a class containing all methods use to perform on two hexadecimal values
 *Date: 29-06-2022 
 *@Author : Divya Prakash Charan
 */

package hexa.calculator;
import java.util.*;

public class Main {

	public static void main(String[] args) { //Main function and entry point of the program
		HexCalc h = new HexCalc();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String opt = " 1. Calculator \n 2. Convert \n 3. Compare \n 4. Exit";
		try{
		while(true){		
		System.out.println(" Choose an option \n" + opt);			
		int choice = scan.nextInt();
			if(choice == 4) { //Condition to break and exit from loop 
			break;
		}		
		switch(choice){
		case 1:h.calculator(); //Calling function using object of HexCalc class 
		break;
		case 2:h.convert(); 
		break;
		case 3:h.compare();  //Use to compare two hexa decimal values
		break;
		default:
			System.out.print("Please choose correct option : " );
		}}}
		catch(Exception e){ //Exception handling using try-catch 
			System.out.println(" Invalid Input ! Please try again ");
		}
}}

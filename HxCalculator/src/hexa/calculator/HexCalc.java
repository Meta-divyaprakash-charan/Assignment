package hexa.calculator; 
import java.util.*;
public class HexCalc{
	Scanner scan = new Scanner(System.in);
	int base = 16;
	 String hexValues = "0123456789ABCDEF";
	/**
	 * Specification
	 * -Convert hexadecimal number to decimal value
	 * 
	 * @param hexa
	 * @return decimalValue
	 */
	 int hexaToDecimal(String hexa){
		hexa = hexa.toUpperCase();
		int decimalValue = 0;
		double power = hexa.length()-1;
		for(int i =0;i<hexa.length();i++){
			char ch = hexa.charAt(i);
			int index = hexValues.indexOf(ch);
			decimalValue += (int)(Math.pow(16.0, power))*index;
			power--;
		}
		return decimalValue;
	}
	 /**
	  * Specification
	  * -Convert decimal number to hexadecimal String
	  *  
	  * @param deci
	  * @param base
	  * 
	  * @return hexaValue
	  */
	 String decimalToHexa(int deci,int base){ 
		String hexaValue = "";
		while(true){
			int x = deci%base;
			hexaValue = hexValues.charAt(x)+ hexaValue;			
			deci = deci/base;
			if(deci==0){	
						break;
			}}
		return hexaValue;
	}
	
	/*This function can perform different arithmetic operations on hexa decimal number */
	public void calculator(){ 
	int result = 0;
	boolean negative = false;
	String opt =" 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide";
	System.out.println(opt);
	int choice = scan.nextInt();
	System.out.println(" Enter first hexa decimal number ");
	String hexa1 = scan.next();
	System.out.println(" Enter second hexa decimal number ");
	String hexa2 = scan.next();
	int h1 = hexaToDecimal(hexa1);
	int h2 = hexaToDecimal(hexa2);
	switch(choice){
	case 1: result = h1+h2;
	break;
	case 2: if(h1>h2){
				result = h1-h2;
			}
			else{
				result = h2-h1;
				negative = true;
			}
	break;
	case 3: result = h1*h2;
	break;
	case 4: if(h2!=0){result = h1/h2;}
	break;
	default: System.out.println(" Please select correct option ");
	break;
	}
	System.out.print("Result is : ");
	if(negative){System.out.print("-");}
	System.out.println(decimalToHexa(result, 16));
	}  
	
	public void convert() { 
		String opt =" 1. Decimal to Hexa\n 2. Hexa decimal to Decimal";
		System.out.println(opt);
		int choice = scan.nextInt();
		if(choice==1){
			System.out.print("Enter a decimal number : ");
			int deci = scan.nextInt();
			String hexaNum = decimalToHexa(deci, 16);
			System.out.println("Hexa decimal conversion of decimal numnber " +deci+ " is " + hexaNum);
		}
		else if(choice==2){
			System.out.print("Enter a Hexa decimal number : ");
			String hexa = scan.next();
			int deciNum = hexaToDecimal(hexa);
			System.out.println("Decimal conversion of hexa decimal numnber " +hexa+ " is " + deciNum);
		}
		else {
			System.out.println(" Please select correct option " );
		}
	}

	public void compare(){  //This function can perform different logical operations on hexa decimal numbers
		System.out.print("Enter first hexa decimal number ");
		String hexa1 = scan.next();
		System.out.print("Enter second hexa decimal number ");
		String hexa2 = scan.next();
		if(equal(hexa1, hexa2))
		{
			System.out.println(hexa1 + " and " + hexa2 + " are equal ");
		}
		else if(greater(hexa1, hexa2)){
			System.out.println(hexa1 + " is greater than " + hexa2);
		}
		else {
			System.out.println(hexa1 + " is less than " + hexa2);
		}
	}

	private boolean greater(String hexa1, String hexa2) {//compare two hexa decimal which is greater or less
		if(hexa1.length()>hexa2.length())
		{
			return true;
		}
		else if(hexa1.length()==hexa2.length()){
			for(int i = 0;i<hexa1.length();i++) {
				char ch1 = hexa1.charAt(i);
				char ch2 = hexa2.charAt(i);
				if(hexValues.indexOf(ch1)>hexValues.indexOf(ch2)){
					return true;
				}
			}	
	    }
		return false;}

	private boolean equal(String hexa1, String hexa2) {//compare two hexa decimal values equals or not
	return hexa1.equalsIgnoreCase(hexa2);
	}
}

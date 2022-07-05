/**
 * this file is part of calculator
 * it calculate area of different shapes
 * 
 * @author Divyaprakash
 * 
 */

package calculator;
import java.util.Scanner;

public class Area {
	/*
	 * Specification
	 * -Calculate area of square and circle
	 * 
	 * @param double width
	 * @param double constant
	 * 
	 * @return double area
	 */
		double area(double width, double constant){
		double area = constant*width*width;
		return area;
	}
		/*
		 * Specification
		 * -Calculate area of triangle and rectangle
		 * 
		 * @param double width
		 * @param double height
		 * @param double constant
		 * 
		 * @return double area
		 */
		
		double area(double width, double height, double constant){
		double area = constant*width*height;
		return area;
	}
	
	public static void main(String[] args) {
	Area a = new Area();
	Scanner sc = new Scanner(System.in);
	double width, height, area=0, constant;
	System.out.println("1.Area of Triangle");
	System.out.println("2.Area of Rectangle");
	System.out.println("3.Area of Square");
	System.out.println("4.Area of Circle");
	int choice = sc.nextInt();
	switch(choice){
	case 1: 
		System.out.print("Enter width of triangle : ");
	    width = sc.nextDouble();
	    System.out.print("Enter height of triangle : ");
	    height = sc.nextDouble();
	    constant = 0.5;
	    area = a.area(width, height, constant);
	    break;
	case 2: 
		System.out.print("Enter width of Rectangle : ");
	    width = sc.nextDouble();
	    System.out.print("Enter height of Rectangle : ");
	    height = sc.nextDouble();
	    constant = 1;
	    area = a.area(width, height, constant);
	    break;
	case 3:
		System.out.print("Enter width of Square : ");
	    width = sc.nextDouble();
	    constant = 1;
	    area = a.area(width, constant);
	    break;
	case 4: 
		System.out.print("Enter radius of Circle : ");
	    width = sc.nextDouble();
	    constant = 3.14;
	    area = a.area(width, constant);
	    break;
	    default:
	    	System.out.print("Invalid input");
	}
	System.out.println(area);
	}
	}

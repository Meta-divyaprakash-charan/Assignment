package com.graphics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<Integer> list;
		Screen screen=new Screen();
		Shape shape = null;
		int choice;
		int x, y;
		Point p;
		
		char c;
		do {
			System.out.println("choose the shape from below options you wnat too create");
			System.out.println("1. Circle");
			System.out.println("2. Rectangle");
			System.out.println("3. triangle");
			System.out.println("4. Square");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the coordinates of center of circle i.e. x and y :");
				x = sc.nextInt();
				y = sc.nextInt();
				p = new Point(x, y);
				System.out.println("Enter the length of radius of circle");
				int radius = sc.nextInt();
				list = new ArrayList<>();
				list.add(radius);
				
				shape = Factory.createShape(ShapeType.CIRCLE, p, list);			
				System.out.println("Shape successfully created ");
				break;

			case 2:
				System.out.println("Enter the coordinates of left bottom corner of rectangle ");
				x = sc.nextInt();
				y = sc.nextInt();
				p = new Point(x, y);
				System.out.println("Enter length of rectangle ");
				int length = sc.nextInt();
				System.out.println("Enter breadth of rectange ");
				int breadth = sc.nextInt();
				list = new ArrayList<>();
				list.add(length);
				list.add(breadth);
				shape = Factory.createShape(ShapeType.RECTANGLE, p, list);
				System.out.println("Shape successfully created ");
				break;

			case 3:
				System.out.println("Enter the coordinates of left side of base ");
				x = sc.nextInt();
				y = sc.nextInt();
				p = new Point(x, y);
				System.out.println("Enter base of triangle ");
				int base = sc.nextInt();
				System.out.println("Enter the height of triangle ");
				int height = sc.nextInt();
				list = new ArrayList<>();
				list.add(base);
				list.add(height);
				shape = Factory.createShape(ShapeType.TRIANGLE, p, list);
				System.out.println("Shape successfully created ");
				break;

			case 4:
				System.out.println("Enter the coordinates of left corner bottom of square ");
				x = sc.nextInt();
				y = sc.nextInt();
				p = new Point(x, y);
				System.out.println("Enter the width of square");
				int width = sc.nextInt();
				list = new ArrayList<>();
				list.add(width);
				shape = Factory.createShape(ShapeType.SQUARE, p, list);
				System.out.println("Shape successfully created ");
				break;

			default:
				System.out.println("Wrong Input , no further shape can be entered");

			}
            
			screen.addShape(shape);
			System.out.println("Do you want to enter another shape(Y/N)");
			c=sc.next().charAt(0);

		} while (c=='y' || c=='Y');
		
	}

}
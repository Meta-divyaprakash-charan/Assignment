/**
 * This file is a part of adt
 * This is Main class for class IntSet
 * 
 * @author Divyaprakash
 */
package com.adt;

import java.util.Scanner;

public class SetMain {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		IntSet set1;
		IntSet set2;
		System.out.println("Create new set");
		set1 = createSet();
		System.out.print("Set is created : ");
		set1.show();
		
		System.out.println("Welcome! Select an operation");
		System.out.println("1. Get Size");
		System.out.println("2. Union");
		System.out.println("3. Intersection");
		System.out.println("4. Difference");
				choice = scan.nextInt();
		switch(choice){
		case 1: System.out.println("Size of set is : " + set1.size());
				break;
		case 2: System.out.println("Enter elements of Set2");
				set2 = createSet();
				System.out.print("Union of set1 and set2 : ");
				set1.union(set2).show();	
				break;
		case 3: System.out.println("Enter elements of Set2");
				set2 = createSet();
				System.out.print("Intersection of set1 and set2 : ");
				set1.intersection(set2).show();	
				break;
		case 4: System.out.println("Enter elements of Set2");
				set2 = createSet();
				System.out.print("Difference of set1 and set2 : ");
				set1.difference(set2).show();	
				break;
		default:System.out.print("Please choose correct option");
				break;
		}	
	}

	private static IntSet createSet(){
		int arraySize;
		System.out.println("Enter number of elements");
		arraySize = scan.nextInt();
		int[] tempArray = new int[arraySize];
		for(int i = 0;i<arraySize;i++){
			System.out.print("Enter "+(i+1)+" Element \n");
			tempArray[i] = scan.nextInt();
		}
		IntSet set = new IntSet(tempArray);
		return set;
	}
}

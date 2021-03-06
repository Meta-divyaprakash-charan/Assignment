/**
 *This file is part of String operations which can perform various operations on String
 * 
 * @Author Divya Prakash Charan
 */
package string.operations;
import java.util.Scanner;
public class StringOp{
	
	/*
	 *Specification:
	 *-Compare two strings
	 *
	 *@param String s1
	 *@param String s2 
	 *
	 *@return int 0|1
	 */
	static int compare(String s1, String s2){
		if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)!=s2.charAt(i)){
					return 0;
				}
			}
			return 1;			
		}		
		return 0;
	}
	
	/*
	 *Specification:
	 *-Reverse a strings
	 *
	 *@param String s
	 *
	 *@return String reverseString
	 */
	static String reverse(String s){
		String reverseString = "";
		int n = s.length()-1;
		for(int i=0;i<=n;i++){
			reverseString+=(s.charAt(n-i));
		}
		return reverseString;
	}
	
	/*
	 *Specification:
	 *-Replace UPPERCASE character to lowercase and vice-versa
	 *
	 *@param String s
	 *
	 *@return String s2
	 */
	 static String changeCase(String s){
		String Up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Lo = "abcdefghijklmnopqrstuvwxyz";
		String s2 = "";
		for(int i = 0; i<s.length();i++){
		char ch = s.charAt(i);
		int index = Up.indexOf(ch);
		int index2 = Lo.indexOf(ch);
		if(index!=-1){
			s2+=Lo.charAt(index);
		}
		else if(index2!=-1){
			s2+=Up.charAt(index2);
		}
		else{
			s2+=ch;
		}}		
		return s2;
	}
	 
	    /*
	     *Specification:
		 *-Find largest word in a string
		 *
		 *@param String s
		 *
		 *@return String word
		 */
		static String largestWord(String s){
		String word ="";
		String temp ="";
		s+=" ";
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i)!=' '){
			temp+=s.charAt(i);
		}
			else{
			word = (word.length()<=temp.length())?temp:word;
			temp = "";
			}}
	return word;
	}
		
	
public static void main(String args[]){
	try (Scanner scan = new Scanner(System.in)) {
		int r = 0;	
		String s1;
		System.out.println("Choose an operation : \n1. Compare two string \n2. Reverse string"+
							"\n3. Change case \n4. Find largest word in string");
		int choice = scan.nextInt();
		switch(choice){
		case 1: 
			System.out.print("Enter first string : ");
			s1 = scan.next();
			System.out.print("Enter second string : ");
			String s2 = scan.next();
			r = compare(s1, s2);
			System.out.println(r);
			break;
		case 2: 
			System.out.print("Enter a string : ");
			s1 = scan.next();
			System.out.println("Reverse of " +s1+" is : " + reverse(s1) );
			break;
		case 3:
			System.out.print("Enter a string : ");
			scan.nextLine();
			s1 = scan.nextLine();
			System.out.println("Changed case of "+s1+" is : " + changeCase(s1));
			break;
		case 4:
			System.out.print("Enter a string : ");
			scan.nextLine();
			s1 = scan.nextLine();
			System.out.println("Largest word in  "+s1+" is : " + largestWord(s1));
			break;
		default: 
			System.out.println("Wrong choice !");
}}
	catch(Exception e){
			System.out.println("Wrong Choice ! please select from given");
}}}

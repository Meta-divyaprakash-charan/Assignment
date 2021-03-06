/**
 * -This file is part of calculator which stores grades of student
 * 
 * @author Divyaprakash
 *
 */
package calculator;

import java.util.*;

public class Marksheet{
	
	/*
	 *-This method calculate average grades
	 *
	 * @param float[] result
	 * 
	 * @result float average
	 */
		float findAvg(float[] result){
		float sum = 0;
		for(int i = 0; i<result.length ;i++){
			sum+=result[i];
		}
		float average = (float)sum/result.length;
		return average;
	}
	
	/*
	 *-This method finds maximum grade value
	 *
	 * @param float[] result
	 * 
	 * @result float max
	 */
		float findMax(float [] result) {
		float max = result[0];
		for(int i = 1; i<result.length;i++){
			max = (max<result[i])?result[i]:max;
		}
		return max;
	}
	
	/*
	 *-This method finds minimum grade value
	 *
	 * @param float[] result
	 * 
	 * @result float min
	 */
		float findMin(float [] result) {
		float min = result[0];
		for(int i = 1; i<result.length;i++){
			min = (min>result[i])?result[i]:min;
		}
		return min;
	}

	/*
	 *-This method calculate percentage of passed students
	 *
	 * @param int[] result
	 * 
	 * @result float percent
	 */
	
	float percent(float [] result) {
		int total = result.length;
		int passed=0;
		for(int i = 0; i<total;i++){
			if(result[i]>=40){
				passed+=1;
			}}
		float percent = (float)(passed*100)/(float)total; 
		return percent;
		}

	public static void main(String[] args) {
		Marksheet m = new Marksheet();
		try (Scanner scan = new Scanner(System.in)){
			System.out.print("Enter number of students : ");
			int n = scan.nextInt();
			if(!(n<=0)){
				float[] result = new float[n];
				for(int i = 0; i<n ;i++){
				System.out.print("Enter number of " + (i+1) +" Student :");
				float grade = scan.nextFloat();
				if(grade<0f||grade>100f)
				{
					i--;
					System.out.println("Grade should be in range 0 to 100 ");
					continue;
				}		
				result[i] = grade;
			}		
			System.out.format("Average grade is : %.2f \n", m.findAvg(result));
			System.out.format("Maximum grade is : %.2f \n", m.findMax(result));
			System.out.format("Minimum grade is : %.2f \n", m.findMin(result));
			System.out.format("Percentage of passed students : %.2f \n", m.percent(result));
			}
			else{
				System.out.println("Please enter a positive number");
			}
		}
		catch(Exception e){
			System.out.println("Invalid input ! ");
		}
     }
}

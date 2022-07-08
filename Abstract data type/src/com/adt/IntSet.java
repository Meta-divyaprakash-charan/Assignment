/**
 * This class is a part of adt
 * This class can perform different operations on sets
 * 
 * @author Divyaprakash
 */
package com.adt;

import java.util.Arrays;

public final class IntSet{
	private int size;
	private int[] set;

	public IntSet(int[] arr) {
		size = 0;
		set = new int[arr.length];
		set(arr);
	}
	
	/**
	 * Specification 
	 * -convert array into set
	 * 
	 * @param arr
	 */
	private void set(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				set[size] = arr[i];
				size++;
			}
		}
		set[size] = arr[arr.length - 1];
		size++;
	}

	/**
	 * Specification 
	 * -Check an integer in a set
	 * 
	 * @param x
	 * @return true|false
	 */
	public boolean isMember(int x) {
		if(Arrays.binarySearch(this.set, x)>=0)
			return true;
		return false;
	}
	
	/**
	 * -This function calculate number of elements in a set
	 * @return size
	 */
	public int size() {
		return this.size;
	}

	/**
	 * Specification 
	 * -Check s is subset of calling object or not
	 * 
	 * @param s
	 * @return true|false
	 */
	public boolean isSubset(IntSet s) {
		for (int i = 0; i < s.size; i++) {
			if (!this.isMember(s.set[i])) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Specification 
	 * -Get union of two sets
	 * 
	 * @param s2
	 * @return union
	 */
	public IntSet union(IntSet set2) {
		int len = set2.size+this.size;
		int[] temp = new int[len];
		int j = 0;
		for(int i = 0;i<(len);i++){
			if (i < set2.size)
				temp[i] = set2.set[i];
			else{
				temp[i] = (this.set[j]);
				j++;
		}
	}	
		IntSet union = new IntSet(temp);
		return union;
	}
	
	/**
	 * -Get complement of a set from universal set
	 * 
	 * @param s2
	 * @return complement
	 */
	public IntSet getCompliment(IntSet s2) {
		int []temp = new int[1000-s2.size];
		int i = 0;
		for (int val = 1; val < 1000; val++) {
			if (!s2.isMember(val)) {
				temp[i] = val;
				i++;
			}}
		IntSet complement = new IntSet(temp);
		return complement;
	}
	
	/* Display all elements of a set */
	public void show() {
		for (int i = 0; i < this.size; i++) {
			System.out.print(this.set[i] + " ");
		}
		System.out.print("\n");
	}
	
	/**
	 *-Find intersection of calling object set with passed argument 
	 *
	 * @param set2
	 * @return inter
	 */
	public IntSet intersection(IntSet set2){
		int len = Math.min(set2.size,this.size);
		int[] temp = new int[len];
		int j = 0;
		for(int i = 0;i<(len);i++){
			if(set2.isMember(this.set[i]))
			{
				temp[j] = this.set[i]; 
				j++;
			}
		}
		IntSet inter = new IntSet(temp);
		return inter;
	}
	
	/**
	 *-Find difference of two sets
	 *
	 * @param set2
	 * @return differ
	 */
	public IntSet difference(IntSet set2)
	{	
		IntSet union = this.union(set2);
		IntSet inter = this.intersection(set2);
		int[] temp = new int[union.size];
		int j = 1;
		
		for(int i=0;i<union.size;i++){
			if(!inter.isMember(union.set[i])){
				temp[j] = union.set[i];
				j++;
			}
		}
		IntSet differ = new IntSet(temp);
		return differ;
}
}

package edu.usfca.cs.cs245;

import java.util.Arrays;

/*
 * Binary Search looks for the target by comparing the middle item in the array.
 * 
 * Purpose: Sets up the binary recursive class up. It is called on by the factory
 * 
 * Base case: 
 * If the middle most item is the target item, return it.
 * 
 * Step case:
 * If the middle item is greater than our target, we search the sub-array to the left.
 * If the middle item is less than our target, we search the sub-array to the right.
 * Keep searching until sub-array is zero.
 * 
 * If target is not found by then, return -1;
 */
public class BinaryRecursiveSearch implements Practice2Search{
	public String searchName(){
		return "Binary-Recursive";
	}
	public int search(int [] arr, int target){
		return search(arr, 0, arr.length-1, target);
	}
	public int search( int[] arr, int low, int high, int target){
		int mid = (low + high) / 2;
	
		//base case:	 
		if (arr[mid] == target){
			//return index of mid
			return mid;
		}
		if (high < low){
//			System.out.println("-1");
			return -1;
		}		
			
		//step case
		if (arr[mid] > target){
			//if middle is greater than target, search lower half of array
			return search(arr, low, mid-1, target);
		}
		else{
			//else, if middle is less than target, search greater
			return search(arr, mid+1, high, target);
		}
		
	}
}

package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search{
	public String searchName(){
		return "Binary-Iterative";
	}
	public int search(int [] arr, int target){
		int high = arr.length;
		int low = 0;
		int mid = (low + high) / 2;
		
		while (low < high){
			
			if (target ==  arr[mid]){
				return target;
			}
			if (target > arr[mid]){
				//if target is bigger than mid, search the upper half of the array
				//set low to mid
				low = arr[mid+1];
				low += 1;
				
			}
			if (target < arr[mid]){
				//if target is less than mid, search the lower half of the array
				//set low = 0
				//set high = mid
				high = arr[mid-1];
				low += 1;
			}
		}
		//return -1 if target cannot be found in the array
		return -1;
	}
}

package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search{
	public String searchName(){
		return "Liner Search";
	}
	public int search(int [] arr, int target){
		//move through array and search for target
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == target){
				return arr[i];
			}
		}
		return -1; 
	}
}

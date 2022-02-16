package q11071;

public class ElementDiff {
	/**
	 * Compute the difference between large and small elements in the given arry
	 * 
	 * 
	 * @return result
	 */ 
	
	public int findDiff(int[] arr) {
		
		//Write your code here
		int largest = arr[0],smallest = arr[0];
		int result=0;
		for(int i =0;i<arr.length;i++){
			if(arr[i]>largest){
				largest = arr[i];
			}
			if(arr[i] < smallest){
				smallest = arr[i];
			}
		}
		result = largest - smallest;
		return result;
	}
}

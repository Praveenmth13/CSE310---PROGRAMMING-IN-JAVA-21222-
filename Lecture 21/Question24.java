package q11072;

public class FindAverage {
	/**
	 * Compute the average of elements in the given array
	 * 
	 * 
	 * @return result
	 */ 
	
	public int findAverage(int[] arr) {
		
		//Write your code here
		int sum = 0;
		for(int i:arr){
			sum+=i;
		}
		return sum/arr.length;
	}
}

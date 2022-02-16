package q11074;

public class SumOfSameNumber {
	/**
	 * Compute the sum of all arg elments in the arr is greater than 10 or not
	 * 
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean findSumOf(int[] arr, int arg) {
		//Write your code here
		int sum = 0;
		boolean result = false;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == arg){
				sum+= arr[i];
			}
		}
		if(sum >= 10 && arr != null){
			result = true;
			return result;
		} else {
			result = false;
			return result;
		}
	}
}

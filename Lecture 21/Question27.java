package q11075;

public class CountOfTwoNumbers {
	/**
	 * Find the count of arg1 is more than arg2 in the arr or not 
	 * 
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean compareCountOf(int[] arr, int arg1, int arg2) {
		//write your code here
		boolean result = false;
		int count1 =0, count2=0;
		for(int i =0;i<arr.length;i++){
			if(arr[i] == arg1){
				count1++;
			}
			if(arr[i] == arg2){
				count2++;
			}
		}
		if(count1 > count2){
			result = true;
			return result;
		} else {
			result= false;
			return result;
		}
		
	}
}

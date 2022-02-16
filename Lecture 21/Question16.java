package q11064;

public class SequenceCount {
	/**
	 * Find the count of sequences present in the given arry.
	 * 
	 * 
	 * 
	 * 
	 * @return count
	 */ 
	
	
	
	public int sequenceCount(int[] arr) {
		
		//Write your code here
		int count = 0 , i=0;
		while(arr != null && i<arr.length-2){
		if((arr[i+1] == 2*arr[i] ) && (arr[i+2] == 3*arr[i])) {
			count++;
		}
		i++;
	}
	return count;
	}
}

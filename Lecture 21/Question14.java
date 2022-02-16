package q11062;

public class SequenceCount {
	/**
	 * Find the sequence count 1,1 int given array
	 * 
	 * 
	 * @return count
	 */
	 
	public int sequenceCount(int[] arr) {
		
		//Write your code here
		int size = arr.length;
		 int count=0;
		 for(int i=0; i<size-1; i++)
		 { 
		 	if(arr != null && arr[i] == 1 && arr[i+1] == 1) 
		 	{ 
		 		count++;
		    }
		 }
		 return count;
	}
}

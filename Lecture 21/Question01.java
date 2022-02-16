package q11046;
public class SumOfElements {
	public long sum(int[] arr) {
		long sum=0;
		// Write the code
		for(int i=0 ; i<arr.length ; i++){
			sum=sum+arr[i];
		}
		return sum;	
	}
}

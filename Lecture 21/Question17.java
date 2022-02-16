package q11065;
public class SumOfArrays {
	/**
	 * Find sum of two array elements and store the elements in the third array
	 * 
	 * 
	 * 
	 * 
	 * @return resultant arry
	 */ 
	
	public int[] sum(int[] arr1, int[] arr2) {
		//Write your code here
		int[] result = new int[arr1.length];
		for(int i = 0, j=0,k=0; i<result.length; i++,j++,k++){
			if(arr1 != null && arr2 != null && arr1.length == arr2.length){
				result[k] = arr1[i]+arr2[j];
			} else {
				result[k] = arr1[i]+arr2[j];
			}
		}
		return result;
		
	}
}

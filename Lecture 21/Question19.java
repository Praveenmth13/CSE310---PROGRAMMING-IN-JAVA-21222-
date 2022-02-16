package q11067;

public class CompareArrays {
	/** Compare lengths and elements of the arr1 and arr2 are equal or not
	 * 
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean compareArrays(int[] arr1, int[] arr2) {
		
		//Write your code here
		int n = arr1.length;
		int m = arr2.length;
		if(n!=m)
		{
			return false;
		}
		for(int i=0; i<n; i++)
		{
			if(arr1 [i] != arr2[i])
			{
				return false;
			}
		}
		return true;
	}
}

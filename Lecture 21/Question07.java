package q11055;

public class ElementCheck {
	
/**
 * Find first and last elements of the array are same are not
 * 
 * @return true if both are same else return false
 */
 

	public boolean elementFinder(int[] arr) {
		
		//Write your code here
		if(arr[0] == arr[arr.length-1])
		{
			boolean yes=true;
			return yes;
		}
		else
		{
			return false;
		}
	}
}

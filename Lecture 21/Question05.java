package q11050;
public class ElementCheck {
	public boolean checkFirstOrLast(int[] arr1, int[] arr2) {
		boolean checkFirstOrLast = false;
		if(arr1[0] == arr2[0] || arr1[arr1.length-1] == arr2[arr2.length-1])
		{
			checkFirstOrLast = true;
		}
		else
		{
			return false;
		}
		return checkFirstOrLast;
	}
}	

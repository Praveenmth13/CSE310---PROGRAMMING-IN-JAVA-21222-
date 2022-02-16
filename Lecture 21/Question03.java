package q11048;

public class ElementCheck {

/** write a logic to check whether the given element is present in the first or last in the array 
 * 
 * 
 * 
 *@return true if the element present if not return false
 * 
 */
 	public boolean checkFirstOrLast(int[] arr, int arg) {
		//Write your code
		boolean checkFirstOrLast = false;
		for(int i = 0; i<arr.length; i++){
			if(arr[0] == arg || arr[arr.length-1] == arg){
				checkFirstOrLast = true;
			} else {
				return false;
			}
		}
		return checkFirstOrLast;
	}
}

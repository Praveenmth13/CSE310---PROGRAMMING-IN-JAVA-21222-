package q11061;

public class FindMiddle {
	/**
	 * Find the middle element in the given array
	 * 
	 * 
	 * 
	 * @ return element
	 */ 
	public void findMiddle(int[] arr) {
			int size = arr.length;
			int big =arr[0];
			int end = size-1;
			int mid,mid1;
			if(size%2 == 0)
			{
				mid=arr[size/2-1];
				mid1=arr[size/2];
				System.out.println(mid+"\n"+mid1);
			} 
			else
			{
				System.out.println(arr[size/2]);
			}
		}
}

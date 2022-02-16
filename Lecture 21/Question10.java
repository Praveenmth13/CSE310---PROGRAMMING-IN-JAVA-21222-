package q11058;
public class SwapFirstAndLast
{
	public static void swap(int[] arr) {
		int swap=0;
		int size=arr.length;
		swap=arr[size-1];
		arr[size-1]=arr[0];
		arr [0]=swap;
		for(int i=0; i<size; i++)
		{
		System.out.println(arr[i]);
		}
	}
}

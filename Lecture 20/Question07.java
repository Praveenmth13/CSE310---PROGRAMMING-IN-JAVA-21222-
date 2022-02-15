package q11045;
public class BinarySearch{
	public static int binaryS(int[] array,int key){
		int low = 0;
		int high = array.length-1;
		while(low <= high){
			int mid = low+(high - low)/2;
			if(array[mid] == key){
				return mid;
			}
			if(array[mid] < key){
				low = mid -1;
			}
			else {
				high = mid -1;
			}
		}
		return-1;
	}
	public static void binarySearch(int[] array,int key){
		int lpu = binaryS(array, key);
		if(lpu == -1){
			System.out.println("Search element "+key+" is not found");
		} else{
			System.out.println("Search element "+key+" is found at position : "+lpu);
		}
	}
}

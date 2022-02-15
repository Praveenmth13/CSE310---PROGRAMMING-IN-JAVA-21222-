package q11044;
public class LinearSearch{
	public static int linearS(int[] array,int key){
		int sizeOfArray = array.length;
		for(int i = 0; i<sizeOfArray; i++){
			if(array[i] == key){
				return i;
			}
		}
		return-1;
	}
	public static void linearSearch(int[] array,int key){
		int lpu = linearS(array, key);
		if(lpu == -1){
			System.out.println("Search element "+key+" is not found");
		} else{
			System.out.println("Search element "+key+" is found at position : "+lpu);
		}
	}
}

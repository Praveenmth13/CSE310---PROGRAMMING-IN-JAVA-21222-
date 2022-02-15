package q11040;
public class InsertionSorting{
	public static void insertionSort(int[] array){
		int sizeOfArray = array.length;
		for(int i=1; i<sizeOfArray; i++){
			int key = array[i];
			int j = i-1;
			while(j >= 0 && key < array[j]){
				array[j+1] = array[j];
				--j;
			}
			array[j+1] = key;
		}
		for(int k = 0; k<sizeOfArray; k++){
			System.out.println(array[k]);
		}
	}
}

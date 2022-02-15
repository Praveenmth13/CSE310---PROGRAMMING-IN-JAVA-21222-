package q11041;
public class SelectionSortingLargestElement{
	public static void selectionSortLargestEle(int[] array){
		int lpu = array.length;
		for(int i =0; i<lpu-1;i++){
			int lowest = i;
			for(int j = i+1;j<lpu;j++){
				if(array[j] < array[lowest]){
					lowest = j;
				}
			}
			int temp = array[i];
			array[i] = array[lowest];
			array[lowest] = temp;
		}
		for(int k = 0; k<lpu;k++){
			System.out.println(array[k]);
		}
	}
}

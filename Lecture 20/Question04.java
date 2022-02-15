package q11042;
public class SelectionSortingSmallestElement{
	public static void selectionSortSmallestEle(int[] array){
		int smallest;
		int lpu = array.length;
		for(int i =0; i<lpu-1;i++){
			smallest = i;
			for(int j = i+1;j<lpu;j++){
				if(array[j] < array[smallest]){
					smallest = j;
				}
			}
			int temp = array[smallest];
			array[smallest] = array[i];
			array[i] = temp;
		}
		for(int k = 0; k<lpu;k++){
			System.out.println(array[k]);
		}
	}
}

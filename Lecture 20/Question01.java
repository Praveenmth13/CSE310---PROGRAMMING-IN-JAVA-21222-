package q11039;
public class BubbleSorting{
	public static void bubbleSort(int[] array){
		int arraySize = array.length;
		int temp;
		for(int i = 0; i<arraySize-1;i++){
			for(int j=0; j<arraySize-i-1;j++){
			if(array[j] > array[j+1]){
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
			}
		}
	}
	for(int k = 0; k<arraySize; k++){
		System.out.println(array[k]);
	}
}
}





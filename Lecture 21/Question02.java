package q11047;
public class ReversePrint {
	public int[] reversePrint(int[] arr) {
		//Wrtie code here
		int [] ReversePrint = new int[arr.length];
		for(int i =0 ; i<arr.length ; i++){
			ReversePrint[i]=arr[arr.length-1-i];
		}
		return ReversePrint;
	}
}

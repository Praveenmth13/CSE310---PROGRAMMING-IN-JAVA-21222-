package q11060;

public class SequenceCheck {
	/**
	 * check if the given array contains the elements 1,2,3 
	 * 
	 * 
	 * 
	 * @return true if contain else return false
	 */
	
	
	
	
	public boolean sequenceCheck(int[] arr) {
			int size = arr.length;
			boolean sequenceCheck = false;
			int a = 1;
			for(int i=0; i<size; i++){
				if(arr[i] == 1 && arr[i]==2){
				sequenceCheck = true;
				} else if(arr[i] == 2){
					sequenceCheck = true;
				} else if(arr[i] == 3 && arr[i] == 1){
					sequenceCheck = true;
				} else if(arr[i] < 0){
					sequenceCheck = false;
					break;
				}
			}
			if(sequenceCheck == true){
			return sequenceCheck;	
			} else{
				return false;
			}
		}	
	}

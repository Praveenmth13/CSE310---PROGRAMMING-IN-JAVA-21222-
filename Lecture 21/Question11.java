package q11059;

public class SequenceCheck {
	/**
	 * Find the given elements present consecutively in the array or not
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean sequenceCheck(int[] arr) {
		int size=arr.length; 
		int count=1; 
		boolean result = false;
		for(int i=0; i<size-1; i++)
		{
			if(arr[i]==6)
			{
				if(arr[i+1] == 9 && arr[i+2] == 12)
				{
					result = true;
				}
				else
				{
					return false;
				}
			}
		}
		return result;
	}
	}

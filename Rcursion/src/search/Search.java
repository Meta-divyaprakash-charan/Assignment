package search;

public class Search{
	private int index = 0;
	private int start = 0;
	private int end;
	private boolean firstTime = true;
	/**
	 * Specification
	 * 
	 * -It sequentially checks each element of the array
	 * -Return index if a match is found
	 * -Return -1 if element is not found in array
	 *  
	 * @param array
	 * @param element
	 * @return i|-1
	 */
	int linearSearch(int[] array, int element){
			if(index>=array.length)
				return -1;
			if(array[index]==element){
				return index;
			}
			index++;
			return linearSearch(array, element);
	}
	/**
	 * Specification
	 * 
	 * -It search and element in array by repeatedly dividing the search interval in half.
	 * -Return index if a match is found
	 * -Return -1 if element is not found in array
	 *  
	 * @param array
	 * @param element
	 * @return i|-1
	 */
	int binarySearch(int[] array, int element){
		
		/* Check element at start or end index */
		if(firstTime){		
			end = array.length-1;
			if(array[end]==element)
				return end;
			if(array[start]==element)
				return start;
			firstTime = false;
		}
		
		index = (start+end)/2;   
		
		if(start+1==end)		    /* Break condition when element not found */
			return -1;
		if(array[index]==element)	/* Break condition when element founded in array */
			return index;
		
		/* Divide search interval into half*/
		{		
			if(array[index]<element)	
				start = index;
			else
				end = index;
		}		
		return binarySearch(array, element);		
	}

}
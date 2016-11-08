package keywords;

import sort.radix.*;

public class RadixSortKeywords {
	
	private int[] intArray;
	private RadixSort sort;
	
	public void SortArray (int[] array, int maxDigit) {
		sort = new RadixSort(array, maxDigit);
	}
	
	public int[] ReturnIntArray() {
		intArray = sort.returnStringArrayAsIntegerArray();
		return intArray;
	}
}
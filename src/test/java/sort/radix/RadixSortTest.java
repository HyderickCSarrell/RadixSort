package sort.radix;

import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;

public class RadixSortTest {
	
	private RadixSort sort;
	private int[] integerArray;
	
	@Before
	public void setup() {
		integerArray = new int[] {432, 4, 56, 750, 0, 100, 85};
		sort = new RadixSort(integerArray, 3);
	}
	
	@Test
	public void testIfArraySorted() {
		int[] testArray = new int[] {0, 4, 56, 85, 100, 432, 750};
		
		assertArrayEquals(testArray, sort.returnStringArrayAsIntegerArray());
	}

}

package sort.radix;

public class RadixSortTest {
	
	private RadixSort sort;
	private int[] integerArray;
	
	@Before
	public void setup() {
		intergerArray[] = {432, 4, 56, 750, 0, 100, 85};
		sort = new RadixSort(intergerArray[]);
	}
	
	@Test
	public void testIfIntegersArePadded() {
		String[] testArray;
		testArray = {"432", "004", "056", "750", "000", "100", "085"};
		assertArrayEquals(testArray, sort.returnArray());
	}
	
	@Test
	public void testIfArraySorted() {
		String[] testArray;
		testArray = {0, 4, 56, 85, 100, 432, 750};
		assertArrayEquals(testArray, sort.sortArray());
	}

}

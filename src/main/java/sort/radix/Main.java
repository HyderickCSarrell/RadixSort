package sort.radix;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] integerArray = new int[] {432, 4, 56, 750, 0, 100, 85};
		
		for(int i = 0; i < integerArray.length; i++) {
			System.out.print(integerArray[i] + " ");
		}
		RadixSort sort = new RadixSort(integerArray, 3);
		int[] sortedArray = sort.returnStringArrayAsIntegerArray();
		System.out.println(" ");
		for(int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
		
    }
}

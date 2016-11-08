package sort.radix;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Integer Array 1 unsorted.");
		System.out.println(" ");
		int[] integerArray = new int[] {432, 4, 56, 750, 0, 100, 85};
		
		for(int i = 0; i < integerArray.length; i++) {
			System.out.print(integerArray[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Integer Array 1 sorted.");
		
		RadixSort sort = new RadixSort(integerArray, 3);
		int[] sortedArray = sort.returnStringArrayAsIntegerArray();
		System.out.println(" ");
		for(int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Integer Array 2 unsorted.");
		System.out.println(" ");
		
		int[] integerArray2 = new int[] {4320, 4, 56, 7500, 0, 1000, 85, 3343, 10, 20, 21, 45};
		
		for(int i = 0; i < integerArray2.length; i++) {
			System.out.print(integerArray2[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Integer Array 2 sorted.");
		
		RadixSort sort2 = new RadixSort(integerArray2, 3);
		int[] sortedArray2 = sort2.returnStringArrayAsIntegerArray();
		System.out.println(" ");
		for(int i = 0; i < sortedArray2.length; i++) {
			System.out.print(sortedArray2[i] + " ");
		}
		
    }
}

package sort.radix;

import java.util.*;
import java.io.*;

public class RadixSort {
   
   private String[] stringArray;
   private int arraySize;
   private Queue[] buckets;
   
   public RadixSort(int[] intArray, int maxDig) {
	   int count = maxDig - 1;
	   arraySize = 0;
	   buckets = new Queue[10];
	   
	   stringArray = new String[intArray.length];
	   
	   for(int i = 0; i < intArray.length; i++) {
		   stringArray[i] = "" + intArray[i];
	   }
	   
	   for(int j = 0; j < stringArray.length; j++) {
			if (stringArray[j].length() < maxDig) {
				stringArray[j] = String.format("%0" + (maxDig - stringArray[j].length()) + "d%s", 0, stringArray[j]);
			}
	   }
	   
	   initBuckets();
	   
	   
	   while(count >= 0) {
			sortArrayIntoBuckets(count);
			emptyBucketsIntoStringArray();
			count--;
	   }
	   count = maxDig - 1;
	   
   }
   
   public void initBuckets() {
	   for (int i = 0; i < 10; i++) {
		   buckets[i] = new Queue();
	   }
   }
   
   public void sortArrayIntoBuckets (int curDigit) {
	   int myInt;
	   
	    for (int i = 0; i < stringArray.length; i++) {
			myInt = Character.getNumericValue(stringArray[i].charAt(curDigit));
			buckets[myInt].enqueue(stringArray[i]);
			
		}
   }
   
   public void emptyBucketsIntoStringArray() {
	   
	   for(int i = 0; i < buckets.length; i++) {
		   while(!buckets[i].isEmpty()) {
			   stringArray[arraySize] = buckets[i].dequeue();
			   arraySize++;
		   }
	   }
	   arraySize = 0;
   }

   public String[] returnStringArray() {
	   return stringArray;
   }
   
   public int[] returnStringArrayAsIntegerArray() {
	   int[] integerArray = new int[stringArray.length];
	   
	   for (int i = 0; i < stringArray.length; i++ ) {
		   integerArray[i] = Integer.parseInt(stringArray[i]);
	   }
	   
	   return integerArray;
   }
}

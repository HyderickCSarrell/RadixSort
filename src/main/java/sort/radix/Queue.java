package sort.radix;

import java.io.*;
import java.util.*;

public class Queue {

	private ArrayList<String> stringNode;
	
	public Queue() {
		stringNode = new ArrayList<>();
	}
	
	public void enqueue (String element) {
		stringNode.add(element);
	}
	
	public String dequeue() {
		if (!stringNode.isEmpty()) {
			String element = stringNode.get(0);
			stringNode.remove(0);
			return element;
		}
		
		else {
			return null;
		}
	
	}
	
	public String first() {
		if (!stringNode.isEmpty()) {
			String element = stringNode.get(0);
			return element;
		}
		
		else {
			return null;
		}
	
	}
	
	public boolean isEmpty() {
		return stringNode.isEmpty();
	}
	
	public int size() {
		return stringNode.size();
	}
	
	public String toString() {
		return "";
		
	}
}
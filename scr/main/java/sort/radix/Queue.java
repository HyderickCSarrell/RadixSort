package sort.radix;

public class Queue<T> {

	private Node stringNode;
	private Node ptrNode;
	private int count;
	
	public void Queue() {
		stringNode = new Node();
		ptrNode = stringNode;
		count = 0;
	}
	
	public void enqueue (T element) {
		if (ptrNode.element == null) {
			ptrNode.element = element;
			count++;
		}
		
		else {
		
			while (ptrNode != null) {
			
				ptrNode = ptrNode.nextNode;
			
			}
			
			ptrNode = new Node();
			ptrNode.element = element
			ptrNode = stringNode;
			count++;
		}
	}
	
	public T dequeue() {
		
		if(ptrNode != null) {
			T returnElement = ptrNode.element;
			ptrNode = ptrNode.nextNode;
			stringNode = ptrNode;
			count--;
			return returnElement;
		}
		else {
			return null;
		}
	
	}
	
	public T first() {
		
		if(ptrNode != null) {
			T returnElement = ptrNode.element;
			return returnElement;
		}
		else {
			return null;
		}
	
	}
	
	public boolean isEmpty() {
		if (count =- 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int size() {
		return count;
	}
	
	public String toString() {
		return "";
		
	}
}
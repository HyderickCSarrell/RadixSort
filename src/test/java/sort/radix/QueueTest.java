package sort.radix;

import org.junit.*;
import static org.junit.Assert.*;

public class QueueTest {
	
	private Queue radixQueue;
	private Queue[] bucketQueue;
	
	@Before
	public void setup() {
		radixQueue = new Queue();
		bucketQueue = new Queue[10];
		
		for (int i = 0; i < 10; i++) {
			bucketQueue[i] = radixQueue;
		}
	}
	
	@Test
	public void testIfAStringCanBeEnqueue() {
		String test = "Hello";
		radixQueue.enqueue(test);
		assertEquals(test, radixQueue.first());
	}
	
	@Test
	public void testIfAStringCanBeDequeue() {
		String test = "Hello";
		radixQueue.enqueue(test);
		assertEquals(test, radixQueue.dequeue());
		assertEquals(null, radixQueue.first());
	}
	
	@Test
	public void testIfBucketQueueIsInitialized() {
		for (int i = 0; i < 10; i++) {
			assertEquals(radixQueue, bucketQueue[i]);
		}
	}
	
	@Test
	public void testIfItemsCanBeEnqueueInBuckets() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {
				bucketQueue[i].enqueue("" + j);
			}
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j =  0; j < 3; j++) {
				assertEquals("" + j, bucketQueue[i].dequeue());
			}
		}
	}
}

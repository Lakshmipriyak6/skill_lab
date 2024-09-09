package priorityqueue;

public class Main {
	    public static void main(String[] args) {
	        GenericPriorityQueue<Integer> intQueue = new GenericPriorityQueue<>();
	        intQueue.enqueue(5);
	        intQueue.enqueue(2);
	        intQueue.enqueue(8);

	        System.out.println("Dequeued from intQueue: " + intQueue.dequeue());
	        System.out.println("Peek intQueue: " + intQueue.peek());

	        GenericPriorityQueue<String> strQueue = new GenericPriorityQueue<>();
	        strQueue.enqueue("apple");
	        strQueue.enqueue("orange");
	        strQueue.enqueue("banana");

	        System.out.println("Dequeued from strQueue: " + strQueue.dequeue());
	        System.out.println("Peek strQueue: " + strQueue.peek());
	    }
	}
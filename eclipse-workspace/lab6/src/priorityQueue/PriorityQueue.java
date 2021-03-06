package priorityQueue;

public class PriorityQueue<T extends Comparable<T>> implements PriorityQueueInterface<T> {
	
	private MinHeap<T> heap;
	
	public PriorityQueue() {
		heap = new MinHeap<T>(100);
	}
	
	public PriorityQueue(T[] values) {
		heap = new MinHeap<T>(100, values);
	}

	@Override
	public T dequeue() {
		return heap.get();
	}

	@Override
	public void enqueue(T value) {
		heap.insert(value);
	}
	
	public void show() {
		heap.show();
	}
}

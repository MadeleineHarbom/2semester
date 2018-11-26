package opgave1;


import java.util.NoSuchElementException;

/**
 * An implementation of a queue using an array
 */
public class ArrayQueue implements Queue {
	private Object[] elements;
	private int currentSize;
	private int head;
	private int tail;
	/**
	 * Constructs an empty queue.
	 */
	public ArrayQueue() {
		elements = new Object[10];
		currentSize = 0;
		head = 0;
		tail = 0;
	}

	/**
	 * Checks whether this queue is empty.
	 * @return true if this queue is empty
	 */
	@Override
	public boolean isEmpty() {
		if (currentSize == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an element to the tail of this queue.
	 * @param newElement the element to add
	 */
	@Override
	public void enqueue(Object newElement) {
		currentSize ++;
		elements[tail] = newElement;
		tail = (tail + 1) % elements.length; //hmmm
	}

	/**
	 * Removes an element from the head of this queue.
	 * @return the removed element
	 */
	@Override
	public Object dequeue() {
		if (currentSize == 0) {
			throw new NoSuchElementException();
		}
		Object removed = elements[head];
		head = (head + 1) % elements.length;
		currentSize --;
		return removed;
	}

	/**
	 * Returns the head of this queue. The queue is unchanged.
	 * @return the head element
	 */
	@Override
	public Object getFront() {
		if (currentSize == 0) {
			throw new NoSuchElementException();
		}
		return elements[head];
	}

	/**
	 * The number of elements on the queue.
	 * @return the number of elements in the queue
	 */
	@Override
	public int size() {
		return currentSize;
	}
}

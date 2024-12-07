package queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class QueueWIthArray<T> implements Queue<T> {
	
	private Object[] o;
	private int front;
	private int rear;
	
	

	QueueWIthArray(int initialCapacity){
		o=new Object[initialCapacity+1];
		front=0;
		rear=0;
	}

	@Override
	//add to rear
	public void offer(T elem) {
		//rear++;
		if(hasNoCapacity())
			throw new RuntimeException("No spaace");
		else {
			o[rear++]=elem;
			checkCapacity(rear,o.length);
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T poll() {
		if(isEmpty())
			throw new RuntimeException("Empty queue");
		front = checkCapacity(front, o.length);
		return (T) (o[front++]);
	}

	@SuppressWarnings("unchecked")
	@Override
	//show from front
	public T peek() {
		front = checkCapacity(front, o.length);
		return (T) (o[front]);
	}

	@Override
	public int size() {
		
		return  checkCapacity(rear+o.length-front,o.length);
	}

	@Override
	public boolean isEmpty() {

		return (front==rear);
	}
	
	private boolean hasNoCapacity() {
		return (front + o.length - rear) % o.length == 1;
		
	}
	//total size = rear+lenght-front
	private int checkCapacity(int index, int totalCapacity) {
		return (index>=totalCapacity?index-totalCapacity:index);
		
	}
	
	public static void main(String[] args) {
		QueueWIthArray<Integer> a = new QueueWIthArray<>(2);
		a.offer(10);
		a.offer(10);
		//a.offer(10);
		System.out.println(a.poll());
		
	}
	
}

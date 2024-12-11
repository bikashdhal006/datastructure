package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;


/*
 * 
 * 
 * The intuition behind this approach is to maintain a max heap (priority queue) 
 * of size K while iterating through the array.
 *  Doing this ensures that the max heap always contains the K smallest 
 *  elements encountered so far. 
 *  If the size of the max heap exceeds K, remove the largest element 
 *  this step ensures that the heap maintains the K smallest elements encountered so far.
 *  In the end, the max heap’s top element will be the Kth smallest element.*/
public class KSamllestElement {
	
	
	private void printKlargestElement( int[] arr,int k) {
		//MAX HEAP
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
		System.out.println(maxHeap);
		for(int i=0;i<arr.length;i++ ) {
		
			maxHeap.offer(arr[i]);
			if(maxHeap.size()>k) {
				maxHeap.poll();
			}
		}
		
		System.out.println(maxHeap.peek());
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		KSamllestElement a = new KSamllestElement();
		 int  arr[] = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
		 int k=4; 
		 a.printKlargestElement(arr, k);
	}

}

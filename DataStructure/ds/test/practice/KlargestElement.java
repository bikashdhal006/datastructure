package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KlargestElement {
	
	
	private void printKlargestElement( int[] arr,int k) {
		PriorityQueue<Integer> minheap = new PriorityQueue<>();
		for(int i=0;i<k;i++ ) {
			minheap.add(arr[i]);
		}
		
		for(int i=k;i<arr.length;i++) {
			if(arr[i]>minheap.peek()) {
				minheap.poll();
				minheap.add(arr[i]);
			}
		}
		System.out.println(minheap);
		 List<Integer> narr =new ArrayList<>();
		while(!minheap.isEmpty()) {
			narr.add(minheap.poll());
		}
		Collections.reverse(narr);
		System.out.println(narr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		KlargestElement a = new KlargestElement();
		 int  arr[] = {1, 23, 12, 9, 30, 2, 50};
		 int k=3; 
		 a.printKlargestElement(arr, k);
	}

}

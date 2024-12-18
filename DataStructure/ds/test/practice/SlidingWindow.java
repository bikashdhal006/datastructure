package practice;

import java.util.ArrayList;
import java.util.List;



public class SlidingWindow {
	
	
	private void maxSubArray(int[] arr) {
		int windowSum=0;
		int maxSum=0;
		int k= 4;//Size of the window to slide
		for(int i=0;i<k;i++) {
			windowSum=windowSum+arr[i]; //for getting the first window data to compare with other window
		}
		maxSum = windowSum;
		for(int i=k;i<arr.length;i++) {
			windowSum = windowSum+arr[i]-arr[i-k];
			maxSum = Math.max(maxSum, windowSum);
		}
		
		System.out.println(maxSum);
	}
	public static void main (String[] args) {
		SlidingWindow x =new SlidingWindow();
		int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20}; //17
		int sum = 11;
		x.maxSubArray(arr);
	}
}

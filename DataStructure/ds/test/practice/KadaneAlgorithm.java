package practice;

import java.util.ArrayList;
import java.util.List;

//GET THE HIGHEST SUMMATION FROM THE ARRAY

/*
 * 
 * 
 Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
Output: 11
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.

*/
public class KadaneAlgorithm {
	
	private void getHighest(int arr[]) {
		int result = arr[0];
		int maxEnding = arr[0];
		List<Integer> a = new ArrayList<>();
		a.add(arr[0]);
		for(int i=1 ;i<arr.length;i++) {
			 
			maxEnding = Math.max(maxEnding+arr[i], arr[i]);
			if(maxEnding<0) {
				a = new ArrayList<>();
			}else {
				a.add(Integer.valueOf(arr[i]));
			}
			result =Math.max(result, maxEnding);
		}
		System.out.println(a);
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		KadaneAlgorithm k = new KadaneAlgorithm();
		int  arr[] = {2, 3, -8, 7, -1, 2, 3};
		k.getHighest(arr);
	}

}

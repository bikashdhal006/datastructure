package practice;

public class LargestSubArray {
	private void maxSubArray(int[] arr,int sum) {
		int windowSum=0;
		int maxSum=0;
		int lastElem= 0;
		int k= 2;//Size of the window to slide
		for(int i=0;i<arr.length;i++) {
			lastElem= arr[i];
			
		}
	}
	public static void main (String[] args) {
		LargestSubArray x =new LargestSubArray();
		int arr[] = {6, 8, 9,10}; //17
		int sum = 17;
		x.maxSubArray(arr, sum);
	}
}



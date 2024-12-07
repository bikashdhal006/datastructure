package practice;

public class SecondLargestNum {
	
	private void  SecondLarge(int arr[]) {
		int maxNum=0;
		int min = 0;
		int sec = 0;
		for(int i=0;i<arr.length;i++) {
			maxNum = Math.max(maxNum,arr[i]);
			min = Math.min(min,arr[i]);
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>min && arr[i]<maxNum) {
				sec =Math.max(arr[i], sec) ;
			}
		}
	
		System.out.println(sec);
	}
	
	public static void main (String[] args) {
		SecondLargestNum x =new SecondLargestNum();
		int arr[] = {12,34,34,6,0,676,56,5,56157,4564564,0}; //17
		x.SecondLarge(arr);
	}
}

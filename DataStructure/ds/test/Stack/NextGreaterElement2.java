package Stack;

import java.util.Stack;

public class NextGreaterElement2 {
	
	private void getNextGreaterLementOnRight(Integer[] arr) {
		
		for(int i =0;i<arr.length;i++) {
			int next = 0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					next = arr[j];
					break;
				}
			}
			System.out.println(arr[i]+"--------"+next);
			next = 0;
		}
		
	
	}

	public static void main(String[] args) {
		NextGreaterElement2 a = new NextGreaterElement2();
		Integer[] intge= {11,17,3,4};
		a.getNextGreaterLementOnRight(intge);

	}

}

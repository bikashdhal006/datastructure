package practice;

public class QuickSortHoaresAlgo {
	
	private void quickSort(int arr[]) {
		
		int i =-1;
		int j = arr.length;
		 int pivot = arr[0];
		
		while(true) {
			do {
				i++;
			}while(arr[i]<pivot);
			
			do {
				j--;
			}while(arr[j]>pivot);
			
			if(i>j) {
				break;
			}
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j]=temp;
			
		}
		for(int k =0;k<arr.length;k++)
		System.out.print(arr[k]);
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		QuickSortHoaresAlgo a = new QuickSortHoaresAlgo();
		 int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
		 a.quickSort(arr);
	}

}

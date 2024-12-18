package leetcodeandgfg;


//Using the Quicksort devide and conquer

public class SortArrayInAsc {
	
	private int partition(int arr[], int min, int max) {
		int pivot = arr[max];
		int i =min-1;
		for(int j=min;j<max;j++) {
			
			if(arr[j]<pivot) {
				i++;
				arr= swap(arr,i,j);
			}
		}
		arr = swap(arr,i+1,max);
		return i+1;
	}
	 static int[] swap(int arr[], int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i]=temp;
		return arr;
	}
	
	private int[] quickSort(int arr[], int min, int max) {
		if(min<max) {
			int pivot = partition(arr,  min,  max);
			quickSort(arr,min,pivot-1);
			quickSort(arr,pivot+1,max);
		}
		return arr;
	}
	
	private void selectionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j =i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	

	public static void main(String[] args) {
		
		SortArrayInAsc sort =new  SortArrayInAsc();
		int arr[] = {0 ,1, 2, 0 ,1, 2};
		arr = sort.quickSort(arr, 0, arr.length-1);
		// sort.selectionSort(arr);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		
	}

}

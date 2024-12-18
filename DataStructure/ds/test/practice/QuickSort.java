package practice;

public class QuickSort {
	
	private static int  partition(int arr[],int max,int min) {
		int i =min-1;
		int pivot = arr[max];
		for(int j=min;j<max;j++) {
			if(pivot>arr[j]) {
				i++;
				arr=swap(arr,i,j);
			}
		}
		arr = swap(arr,i+1,max);
		return i+1;
	}
	
	private static  int[] swap(int arr[],int i,int j) {
		int temp = arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
		return arr;
	}
	
	 private int[] quickSort(int arr[],int max,int min) {
		if(max>min) {
			int pivot  = partition(arr, max, min);
			quickSort(arr,pivot-1,min);
			quickSort(arr,max,pivot+1);
		}
		return arr;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		QuickSort a = new QuickSort();
		 int[] arr = {0 ,1, 2, 0, 1, 2};
		 int max = arr.length-1;
		 
		arr= a.quickSort(arr,max,0);
		 for(int k =0;k<arr.length;k++)
				System.out.print(arr[k]+" ");
		 
	}

}

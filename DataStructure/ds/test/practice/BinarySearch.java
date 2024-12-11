package practice;

public class BinarySearch {
	
	private void binarySearch(int arr[],int search) {
		int r= arr.length-1;
		int l = 0 ;
		int mid =0;
		boolean found=false;
		while(l<=r) {
			mid= l+(r-l)/2;
			if(arr[mid]==search) {
				
				found=true;
				break;
			}
			 if(arr[mid]<search) {
				l = mid+1;
			}
			 else{
				 r = mid-1;
			 }	
		}
		
		if(found)
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
	
public static void main(String[] args) {
		
	BinarySearch k = new BinarySearch();
		int  arr[] = {-8, -7, -1, 2, 3,56,79};
		k.binarySearch(arr,-1);
	}


}

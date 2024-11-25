package linkedlist;

public class BubbleSort {
	
	public int[] sort(int[] list) {
		
		for(int i=0;i<list.length;i++) {
			//int j =i;
			boolean swap =false;
			for(int j=i+1;j<list.length;j++) {
				if(list[i]>list[j]) {
					int temp = list[j];
					list[j]=list[i];
					list[i]=temp;
					swap=true;
				}
			}
			if(!swap)
				break;
		}
		return list;
	}
	
	public void print(int[]list) {
		for(int i=0;i<list.length;i++)
			System.out.println(list[i]);
	}

	public static void main(String[] args) {
		int[]a= {545,6,1};
		BubbleSort ins = new BubbleSort();
		a=ins.sort(a);
		ins.print(a);

	}

}

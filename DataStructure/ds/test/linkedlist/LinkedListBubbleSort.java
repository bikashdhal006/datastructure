package linkedlist;

public class LinkedListBubbleSort {
	
	int data;
	private LinkedListBubbleSort next;
	
	private LinkedListBubbleSort head=null;
	private LinkedListBubbleSort tail=null;
	
	LinkedListBubbleSort(int data){
		this.data  = data;
		this.next=null;
	}
	
	
	public LinkedListBubbleSort() {
		// TODO Auto-generated constructor stub
	}

	public LinkedListBubbleSort sort(LinkedListBubbleSort node) {
		
		
		while(node.head!=null) {
			if(node.head.data>node.head.next.data) {
				LinkedListBubbleSort temp=node.head.next;
				node.head.next = node.head;
				node.head = temp;	
			}
		}
		
		return node.head;
	}
	
	public LinkedListBubbleSort add(LinkedListBubbleSort node,int data) {
		LinkedListBubbleSort next = new LinkedListBubbleSort(data);
		if(node.head==null) {
			node.tail=node.head = next;
		}else {
			node.tail.next=next;
			node.tail=tail.next;
		}
		return node;
	}
	
	
	public void print(LinkedListBubbleSort node) {
		while(node.head!=null) {
			System.out.println(node.head.data);
			node.head = node.head.next;
		}
			
	}
	

	public static void main(String [] args) {
		LinkedListBubbleSort a =new  LinkedListBubbleSort();
		a=a.add(a,12312);
		a=a.add(a,3434);
		a=a.add(a,1);
		
		//a.addFirst(55);
		
		//a.addInMiddle(45,3);
		//a.print(a);
		a=a.sort(a);
		a.print(a);
		//Print Middle Of LL
		//a.printMiddleOfLl();
		
		;
	}

	
}

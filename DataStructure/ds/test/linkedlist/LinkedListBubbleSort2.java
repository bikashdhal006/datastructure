package linkedlist;

public class LinkedListBubbleSort2 {
	
	int data;
	private LinkedListBubbleSort2 next;
	
	private LinkedListBubbleSort2 head=null;
	private LinkedListBubbleSort2 tail=null;
	
	LinkedListBubbleSort2(int data){
		this.data  = data;
		this.next=null;
	}
	
	
	public LinkedListBubbleSort2() {
		// TODO Auto-generated constructor stub
	}

	public static LinkedListBubbleSort2 sort(LinkedListBubbleSort2 node) {
		
		
		while(node.head!=null) {
			if(node.head.data>node.head.next.data) {
				LinkedListBubbleSort2 temp=node.head.next;
				node.head.next = node.head;
				node.head = temp;	
			}
		}
		
		return node.head;
	}
	
	public LinkedListBubbleSort2 add(int data) {
		LinkedListBubbleSort2 next = new LinkedListBubbleSort2(data);
		if(head==null) {
			tail=head = next;
		}else {
			tail.next=next;
			tail=tail.next;
		}
		return head;
	}
	
	
	public void print(LinkedListBubbleSort2 head) {
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
			
	}
	

	public static void main(String [] args) {
		LinkedListBubbleSort2 a =new  LinkedListBubbleSort2();
		a=a.add(12312);
		a=a.add(3434);
		a=a.add(1);
		
		//a.addFirst(55);
		
		//a.addInMiddle(45,3);
		//a.print(a);
		//a=a.sort(a);
		a.print(a);
		//Print Middle Of LL
		//a.printMiddleOfLl();
		
		;
	}

	
}

package Stack;


//Idea is to implement push and pop method of stack 
public class StackTrial {
	
	private StackTrial next;
	private int data;
	
	
	private StackTrial head;
	private StackTrial tail;
	
	private StackTrial ( int data){
		this.data= data;
		this.next = null;
	}
	
	private StackTrial ( ){
	}
	
	private StackTrial push(StackTrial node , int data) {
		StackTrial newhead = new StackTrial(data);
		
		if(null==node.head) {
			node.head=node.tail=newhead;
		}else {
			StackTrial temp = head;
			newhead.next=temp;
			node.head= newhead;
		}
		
		return node;
		
	}
	
	
	private int pop(StackTrial node ) {
		int retdata =0;
		
		if(null!=node.head) {
			retdata =  node.head.data;
			
			StackTrial temp = node.head;
			node.head = temp.next;
			temp=null;
			
		}
		return retdata;
	}
	
	private void print(StackTrial node) {
		while(null!=node.head) {
			System.out.println(node.head.data);
			node.head = node.head.next;
		}
		
	}
	
	
	public static void main(String[] args) {
		StackTrial brc =new StackTrial();
		
		brc = brc.push(brc, 10);
		brc = brc.push(brc, 25);
		brc = brc.push(brc, 35);
		
		
		brc.pop(brc);
		brc.pop(brc);
		brc.print(brc);
	}
	

}

package linkedlist;


//Adding elements to ll
public class AddElementsToLl {
	
	private Integer data;
	private AddElementsToLl nextnode;
	
	
	
	private AddElementsToLl head=null;
	private AddElementsToLl tail=null;
	
	
	
	AddElementsToLl(Integer data){
		this.data = data;
		nextnode=null;
	}
	AddElementsToLl(){
		nextnode=null;
	}
	
	
	//It will always add elements to last
	private void  add(Integer data) {
		AddElementsToLl newNode=new  AddElementsToLl(data);
		if(head==null) {
			head =  tail = newNode;
		}
		else {
			tail.nextnode = newNode;
			tail=tail.nextnode;
		}
	}
	
	
	//It will always add elements to first
	private void  addFirst(Integer data) {
		AddElementsToLl newNode=new  AddElementsToLl(data);
		if(head==null) {
			head =  tail = newNode;
		}
		else {
			AddElementsToLl temp = head;
			newNode.nextnode=temp;
			head = newNode;
			
		}
	}
	
	
	private void  addInMiddle(Integer data,int index) {
		AddElementsToLl newNode=new  AddElementsToLl(data);
		if(head==null) {
			head =  tail = newNode;
		}
		else {
			
			///index = index;
			//get the previous node of the idex provided
			
			AddElementsToLl currentNode =head;//
				for(int i=1;i<index-1 && null!=head;i++) {
					currentNode = head.nextnode;
				
			}
				 if (currentNode != null) {
				newNode.nextnode=currentNode.nextnode;
				currentNode.nextnode=newNode;
				head =currentNode; 
				 }
				
				
		}
		
	}
	
	
	//Hare and tortoise aproach
	private void  printMiddleOfLl() {
		 AddElementsToLl fast =head;
		 AddElementsToLl slow =head;	
		while(slow!=null && fast.nextnode!=null) {
			slow = slow.nextnode;
			fast=fast.nextnode.nextnode;
		}
		System.out.println(slow.data);
	}
		
	
	
	
	 private void print () {
		 System.out.println("Hello");
		while(head!=null) {
			System.out.println(head.data);
			head = head.nextnode;
		}
	}
	
	
	public static void main(String [] args) {
		AddElementsToLl a =new  AddElementsToLl();
		a.add(3);
		a.add(5);
		a.add(8);
		a.add(10);
		
		//a.addFirst(55);
		
		a.addInMiddle(45,3);
		a.print();
		//Print Middle Of LL
		//a.printMiddleOfLl();
		
		;
	}

}

package linkedlist;


//Adding elements to ll
public class AddElementsToLl2 {
	
	private Integer data;
	private AddElementsToLl2 nextnode;
	
	
	
	private AddElementsToLl2 head=null;
	private AddElementsToLl2 tail=null;
	
	
	
	AddElementsToLl2(Integer data){
		this.data = data;
		nextnode=null;
	}
	AddElementsToLl2(){
		nextnode=null;
	}
	
	
	//It will always add elements to last
	private AddElementsToLl2   add(Integer data,AddElementsToLl2 node) {
		AddElementsToLl2 newNode=new  AddElementsToLl2(data);
		
		if(node.head==null) {
			node.head =  node.tail = newNode;
			return node;
		}
		else {
			node.tail.nextnode = newNode;
			node.tail=node.tail.nextnode;
			return node; 
			
		}
	}
	
	
	//It will always add elements to first
	private AddElementsToLl2  addFirst(Integer data,AddElementsToLl2 node) {
		AddElementsToLl2 newNode=new  AddElementsToLl2(data);
		if(node.head==null) {
			node.head =  node.tail = newNode;
			return node;
		}
		else {
			AddElementsToLl2 temp = node.head;
			newNode.nextnode=temp;
			node.head = newNode;
			return  node;
			
		}
	}
	
	
	private void  addInMiddle(Integer data,int index) {
		AddElementsToLl2 newNode=new  AddElementsToLl2(data);
		if(head==null) {
			head =  tail = newNode;
		}
		else {
			
			///index = index;
			//get the previous node of the idex provided
			
			AddElementsToLl2 currentNode =head;//
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
	private void  printMiddleOfLl(AddElementsToLl2 node) {
		 AddElementsToLl2 fast =node.head;
		 AddElementsToLl2 slow =node.head;	
		while(fast!=null && fast.nextnode!=null) {
			slow = slow.nextnode;	
			fast=fast.nextnode.nextnode;
		}
		System.out.println(slow.data);
	}
		
	
	
	
	 private void print (AddElementsToLl2 node) {
		 System.out.println("Hello");
		while(node.head!=null) {
			System.out.println(node.head.data);
			node.head = node.head.nextnode;
		}
	}
	
	
	public static void main(String [] args) {
		AddElementsToLl2 a =new  AddElementsToLl2();
		a=a.add(3,a);
		a=a.add(5,a);
		a=a.add(8,a);
		a=a.add(10,a);
		a=a.add(11,a);
		a=a.add(13,a);
		//a=a.addFirst(55,a);
		a.printMiddleOfLl(a);
		
		
		//a.addInMiddle(45,3);
	//	a.print(a);
		//Print Middle Of LL
		
		
		;
	}

}

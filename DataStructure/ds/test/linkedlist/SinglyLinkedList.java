package linkedlist;

import java.util.Stack;

//TO Create Singly Linked lIst nad add elements and reverse it using stack
public class SinglyLinkedList {
	
	private Integer data;
	private SinglyLinkedList next;
	
	SinglyLinkedList(Integer data ){
		this.data=data;
		next=null;
	}
	
	private void printData(SinglyLinkedList head) {
		while(head !=null) {
			System.out.println(head.data);
			head= head.next;
		}
	}
	
	private SinglyLinkedList reverse(SinglyLinkedList head) {
		Stack<SinglyLinkedList> s = new Stack<>();
		SinglyLinkedList temp=head;
		
		//Adding all elemnt to stack as top of the stack will contain last Node
		while(temp !=null) {
			s.push(temp);
			temp= temp.next;
		}
		
		if(null!=s) {
			//pop is used to get the last element from the stack as it eill have null as next node
			head = s.pop();
			
			temp=head;
			
			while(!s.isEmpty()) {
				temp.next =s.pop();
				temp  = temp.next;
			}
			//Setting las tnode to nullotherise it will create infinit loop
			temp.next=null;
		}
		return head;
	}
	
	
	public static void main(String[] args) {
		SinglyLinkedList head = new SinglyLinkedList(10);
		head.next = new SinglyLinkedList(30);
		head.next.next = new SinglyLinkedList(20);
		head.printData(head);
		head = head.reverse(head);
		System.out.println("AfterReverse");
		head.printData(head);
	}

}

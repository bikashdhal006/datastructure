package linkedlist;

import java.util.ArrayList;
import java.util.HashSet;

//Program to find the Nth Nde in Linked list
public class FindNthNodeInLL {
	
	private Integer data;
	private FindNthNodeInLL nexNode;
	 
	FindNthNodeInLL(Integer data){
		
		this.data=data;
		nexNode=null;
	}
	
	 static void print (FindNthNodeInLL head) {
		while(head!=null) {
			System.out.println(head.data);
			head = head.nexNode;
		}
	}
	 
	 static void printNthNodeData(FindNthNodeInLL head,int index) {
		 ArrayList<FindNthNodeInLL> node = new ArrayList<>();
		 if(null==head)
			 throw new ArrayIndexOutOfBoundsException("No Data for this index");
		 //get the count from the loop throw exception if indexout of bound
		 int count = 0;
		 while(head!=null) {
			
			 node.add(head);
			 head = head.nexNode;
			 count++;
		 }
		 if(index>count)
			 throw new ArrayIndexOutOfBoundsException("No Data for this index:"+index);
		
		 System.out.println(node.get(index).data);
	 }
	
	public static void main(String[] args) {
		FindNthNodeInLL head = new FindNthNodeInLL(76);
		head.nexNode  =  new FindNthNodeInLL(6);
		head.nexNode.nexNode =  new FindNthNodeInLL(10);
		head.nexNode.nexNode =  new FindNthNodeInLL(5);
		//head = null;
		printNthNodeData(head,0);
	}

}

package tree;

import java.util.LinkedList;

//Checking 2 tree are content euqal or not 
//Node A
//10
//Right child 2
//left child 3

//Node B
//10
//Right child 2
//left child 3

//Node A and Node B are equal
public class EqaulTree {
	
	private boolean checkEqual(Node n1, Node n2) {
		if(n1==null && n2 ==null) {
			return true;
		}
		else if(n1==null || n2 ==null) {
			return false;
		}
		else {
			return (n1.data==n2.data && 
					checkEqual(n1.right, n2.right)&&
					checkEqual(n1.left, n2.left));
		}
	}
	
	
	public static void main(String args[]) {
		EqaulTree a = new EqaulTree() ;
		
		// Representation of input binary tree 1
        //        10
        //       / \
        //      3   2
        //     /
		//    14
        
		Node n1 = new Node(10); 
		n1.right = new Node(2);
		n1.left = new Node(3);
		n1.left.left= new Node(14);
		
		// Representation of input binary tree 2
        //        10
        //       / \
        //      3   2
        //     /
		//    14
        
		Node n2 = new Node(10); 
		n2.right = new Node(2);
		n2.left = new Node(3);
		n2.left.left= new Node(14);
		
		System.out.println(a.checkEqual(n1, n2));
	}

}

class Node{
	int data;
	Node right;
	Node left;
	
	Node(int data){
		this.data = data;
		right=left=null;
	}
}

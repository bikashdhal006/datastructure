package Stack;

import java.util.Stack;

public class NextGreaterElement {
	
	private void getNextGreaterLementOnRight(Integer[] arr) {
		Stack<Integer> s =new Stack<>();
		for(int i=0;i<arr.length;i++) {
			if(!s.isEmpty()) {
				int elem = s.pop();
				
			}
			
			
		}
	}

	public static void main(String[] args) {
		NextGreaterElement a = new NextGreaterElement();
		Integer[] intge= {11,17,3,4};
		a.getNextGreaterLementOnRight(intge);

	}

}

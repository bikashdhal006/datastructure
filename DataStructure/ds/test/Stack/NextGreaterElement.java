package Stack;

import java.util.Stack;

public class NextGreaterElement {
	
	private void getNextGreaterLementOnRight(Integer[] arr) {
		Stack<Integer> s =new Stack<>();
		for(int i=0;i<arr.length;i++) {
			int next = arr[i];
			if(!s.isEmpty()) {
				int elem = s.pop();
				
				while(next>elem) {
					System.out.println(elem+"---"+next);
					if(s.isEmpty()) {
						break;
					}
					elem = s.pop();
				}
				
				if(elem>next) {
					s.push(elem);
				}
			}
			s.push(next);
			
		}
		
		System.out.println(s);
	}

	public static void main(String[] args) {
		NextGreaterElement a = new NextGreaterElement();
		Integer[] intge= {100, 180, 260,  
                310, 40, 535, 695};
		a.getNextGreaterLementOnRight(intge);

	}

}

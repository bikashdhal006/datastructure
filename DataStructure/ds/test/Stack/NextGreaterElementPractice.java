package Stack;

import java.util.Stack;

public class NextGreaterElementPractice {
	
	private void getNextGreaterLementOnRight(Integer[] arr) {
		Stack<Integer> s = new Stack<>();
		
		for(int i=0;i<arr.length;i++) {
			int next   = arr[i];
			
			if(!s.isEmpty()) {
				int curr = s.pop();
				
				while(next>curr) {
					System.out.println(curr+"---"+next);
					if(s.isEmpty()) {
						break;
					}
					curr = s.pop();
					
				}
				if(next<curr) {
					s.push(curr);
				}
			}
			s.push(next);
		}
		
	}

	public static void main(String[] args) {
		NextGreaterElementPractice a = new NextGreaterElementPractice();
		Integer[] intge= {11,17,3,5};
		a.getNextGreaterLementOnRight(intge);
		
	}

}

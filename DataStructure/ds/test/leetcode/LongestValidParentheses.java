/**
 * 
 */
package leetcode;

import java.util.Stack;

/**
 * 
 */
public class LongestValidParentheses {
	
	
	public int getlongestParan(String s) {
		int max = 0;
		Stack<String> st = new Stack<>();
		for(int i = 0;i<s.length();i++) {
			String b = String.valueOf(s.charAt(i));
			
			String rev = getReverseBracket(b);
			if(checkIsLeft(b)) {
				//if(st.isEmpty())
					st.push(b);
			}else  {
				if(!st.isEmpty()) {
					st.pop();
					max+=2;
				}
				////while(!st.isEmpty())
				//st.pop();
				
			}
			
		}
		return max;
		
		
	}

public static void main(String[] args) {
		
		
		LongestValidParentheses l =new LongestValidParentheses();
		l.getlongestParan("()(())");
	}

	public String getReverseBracket(String s) {
		String ret = "";
		switch (s) {
		case "{": {
			
			ret = "}";
			break;
		}
		case "[": {
			
			ret = "]";
			break;
		}
		
		case "(": {
			
			ret = ")";
			break;
		}
		case "}": {
			
			ret = "{";
			break;
		}
		case "]": {
			
			ret = "[";
			break;
		}
		
		case ")": {
			
			ret = "(";
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + s);
		} 
		return ret;
	}
	
	public boolean checkIsLeft(String s) {
		boolean ret = false;
		switch (s) {
		case "{": {
			
			ret=true;
			break;
		}
		case "[": {
			
			ret=true;
			break;
		}
		
		case "(": {
			
			ret=true;
			break;
		}
		
		default:{
			ret=false;
		}
		} 
		return ret;
	}
	
	
}

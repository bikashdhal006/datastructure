package Stack;

import java.util.Iterator;
import java.util.Stack;

public class BracketCheck {
	
	public boolean checkBracket(String s) {
		Stack<String> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			String br =String.valueOf(s.charAt(i));
			String a = getReverseBracket(br);
			
			if(checkIsLeft(br)) {
				st.push(br);
			}
			else if(st.isEmpty() || !st.pop().equalsIgnoreCase(a)) {
					return false;
			}	
	}
		return st.isEmpty();
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
	
	public static void main(String[] args) {
		BracketCheck brc =new BracketCheck();
		
		System.out.println(brc.checkBracket("{[[()]]}"));
		System.out.println(brc.checkBracket("{[[()]]"));

	}

}

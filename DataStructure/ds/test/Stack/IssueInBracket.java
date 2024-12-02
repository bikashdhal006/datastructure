package Stack;

import java.util.Stack;

//Getting the position of the string where issues happened

public class IssueInBracket {
	
	
	
	public boolean checkBracket(String s) {
		boolean ret = false;
		Stack<String> br = new Stack<>();
		int last_isse=0;
		
		for(int i=0;i<s.length();i++)
		{
			last_isse = i;
			String ori = String.valueOf(s.charAt(i));
			String rev =getReverseBracket(ori);
			
			if(checkRight(ori)) {
				br.push(ori);
			}
			else if(br.isEmpty() || !br.pop().equals(rev)) {
				ret = false;
				
				//System.out.println("Issue In Index : "+i);
				
				break;
			}
			
			
		}
		if(!br.isEmpty()) {
			//last_isse+=1;
			System.out.println("Issue In Index : "+last_isse);
		}
		return br.isEmpty();
		
	}
	
	public String getReverseBracket(String s) {
	String ret= "";
	
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
		case ")": {
			ret = "(";
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
		default:
			throw new IllegalArgumentException("Unexpected value: " + s);
		} 
		return ret;
	}
	
	private boolean checkRight(String s) {
		boolean ret=  false;
		if(s.equalsIgnoreCase("{") || s.equalsIgnoreCase("[") || s.equalsIgnoreCase("(") ) {
			ret = true;
		}
		return ret;
	}
	 
	public static void main(String [] args) {
		IssueInBracket in =new IssueInBracket();
		System.out.println(in.checkBracket("{([]){"));;
	}

}

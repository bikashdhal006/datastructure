package Stack;


//Check If Given Stirng is comment

/*gdfgdf*/
public class CommentString {

	public boolean comment(String s) {
		if(checkStart(s)&& checkEnd(s)) {
			return true;
		}
		return false;
	}
	
	private boolean checkStart(String s) {
		if(String.valueOf(s.charAt(0)).equalsIgnoreCase("/") && String.valueOf(s.charAt(0)).equalsIgnoreCase("/")) {
			return true;	
		}
		else if(String.valueOf(s.charAt(0)).equalsIgnoreCase("/") && 
				String.valueOf(s.charAt(1)).equalsIgnoreCase("*")) {
			return true;
		}
		return false;
	}
	
	private boolean checkEnd(String s) {
		if(String.valueOf(s.charAt(0)).equalsIgnoreCase("/") && String.valueOf(s.charAt(1)).equalsIgnoreCase("/")) {
			return true;	
		}
		else if(String.valueOf(s.charAt(0)).equalsIgnoreCase("/") && 
				String.valueOf(s.charAt(1)).equalsIgnoreCase("*")&&
				String.valueOf(s.charAt(s.length()-2)).equalsIgnoreCase("*") && 
				String.valueOf(s.charAt(s.length()-1)).equalsIgnoreCase("/")
				)  {
			
			System.out.println(s.charAt(s.length()-1));
			System.out.println(s.charAt(s.length()-2));
			return true;
		}
	
		return false;
	}
	
	public static void main(String [] args) {
		CommentString in =new CommentString();
		System.out.println(in.comment("//gdfgdf*/"));;
	}
}

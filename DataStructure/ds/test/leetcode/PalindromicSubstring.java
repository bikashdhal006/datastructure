/**
 * 
 */
package leetcode;

/**
 * 
 * 647. Palindromic Substrings
Medium
Topics
Companies
Hint
Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.

 

Example 1:

Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:

Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 

Constraints:

1 <= s.length <= 1000
s consists of lowercase English letters.

https://leetcode.com/problems/palindromic-substrings/description/

Tutor
https://www.youtube.com/watch?v=UBTCzz8H8K8&t=958s


 */
public class PalindromicSubstring {
	  public int countSubstrings(String s) {
	        int count =0;
	        for(int i=0;i<s.length();i++) {
	        	count = count+getCount( i, i,  s);	
	        	count = count+getCount( i, i+1,  s);
	        }
	        return count;
	    }
	  
	  public int getCount(int left,int right, String s) {
		  int finalCount=0;
		  while(left>=0 && right<s.length()&& s.charAt(right)==s.charAt(left)) {
      		left--;
      		right++;
      		finalCount++;
      	}
		  return finalCount;
	  }
	  
	public static void main(String[] args) {
		PalindromicSubstring p =new PalindromicSubstring();
		p.countSubstrings("abc");

	}

}

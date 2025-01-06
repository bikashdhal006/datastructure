/**
 * 
 */
package leetcode;

/**
 * 
 * 9. Palindrome Number
Easy
Topics
Companies
Hint
Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?

https://leetcode.com/problems/palindrome-number/description/
 * 
 */
public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		boolean ret =false;
		int num=0;
		int rev =x;
		
        if (Integer.signum(x)<0)
        	return ret;
        while(x!=0) {
        	int c = x%10;
        	num = num*10+c;
        	x=x/10;
        	
        }
        if(rev==num) {
        	ret =true;
        }
        return ret;
    }
	public static void main(String[] args) {
		PalindromeNumber p = new PalindromeNumber();
		p.isPalindrome(10);

	}

}

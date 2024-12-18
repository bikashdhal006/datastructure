/**
 * 
 */
package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Longest Substring Without Repeating Characters
Medium
Topics
Companies
Hint
Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		
		int max=0;
		if( s.length()==1) {
			max = s.length();
			return max;
		}else if(s.isBlank()&&s.isEmpty()) {
			return max;
		}
		Set<String> st= new HashSet<>();
		int left = 0;
		int right = 0;
		
		while(right<s.length()) {
			if(st.contains(String.valueOf(s.charAt(right)))) {
				st.remove(String.valueOf(s.charAt(left)));
				left++;
			}
			else {
				st.add(String.valueOf(s.charAt(right)));
				right++;
				max = Math.max(st.size(), max);
			}
		}
        return max;
    }
	public static void main(String[] args) {
		LongestWithoutRepeatingCharacters t = new LongestWithoutRepeatingCharacters();
		int max = t.lengthOfLongestSubstring("dvdf");
		System.out.println(max);

	}

}

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.

	Examples:

	Given "abcabcbb", the answer is "abc", which the length is 3.

	Given "bbbbb", the answer is "b", with the length of 1.

	Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

/**
 * @author thejussinghj
 *
 */
public class LengthOfLongestSubstring {

	public static int lengthOfLongestSubstring(String s) {
		int longSubstring = 0;
        Set<Character> set = new HashSet<>();
        int slow = 0;
        int fast = 0;
        while(fast < s.length()){
            if(!set.contains(s.charAt(fast))){
                set.add(s.charAt(fast++));
                longSubstring = Math.max(longSubstring, set.size());
            }
            else{
                set.remove(s.charAt(slow++));
            }
        }
        
        return longSubstring;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "c";
		System.out.println(lengthOfLongestSubstring(s));
	}

}

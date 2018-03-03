/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

	Example:
	Input: "babad"
	Output: "bab"				Note: "aba" is also a valid answer.
 
	Example:
	Input: "cbbd"
	Output: "bb"
 */

/**
 * @author thejussinghj
 *
 */
public class LongestPalindromicSubstring {

	public static String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int max = 0;
        for(int i=0; i<s.length(); i++){
            max = Math.max(palindrome(s, i, i), palindrome(s, i, i+1));
            if(max > end - start){
                start = i- (max-1)/2;
                end = i+max/2 + 1;
            }
        }
        return s.substring(start, end);
    }
    
    public static int palindrome(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "babccdcdccbacbd";
		System.out.println(longestPalindrome(s));
	}

}

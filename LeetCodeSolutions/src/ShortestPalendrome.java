/**
 * 
 */
package Mar3rd;

/**
 * @author thejussinghj
 *
 */
public class ShortestPalendrome {
	public static String shortestPalindrome(String s) {
        String prefix = kmp(new StringBuilder(s).reverse().toString(), s);
        return prefix+s;
    }
    
    public static String kmp(String text, String pattern){
        int[] suffixPrefixArray = computeTempArray(pattern);
        int i = 0;
        int j = 0;
        while(i<text.length() && j<pattern.length()){
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j != 0){
                    j = suffixPrefixArray[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return new StringBuilder(pattern.substring(j, pattern.length())).reverse().toString();
    }
    
    private static int[] computeTempArray(String pattern){
        int[] tempArray = new int[pattern.length()];
        int index = 0;
        for(int i=1; i<pattern.length();){
            if(pattern.charAt(i) == pattern.charAt(index)){
                tempArray[i] = index+1;
                index++;
                i++;
            }
            else{
                if(index != 0){
                    index = tempArray[index-1];
                }
                else{
                    tempArray[i] = 0;
                    i++;
                }
            }
        }
        
        return tempArray;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aacecaaa";
		System.out.println(shortestPalindrome(s));
	}

}

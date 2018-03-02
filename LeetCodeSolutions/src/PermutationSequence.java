/**
 * 
 */

/**
 * @author thejussinghj
 *
 */
public class PermutationSequence {

	static boolean found = false;
	static int count = 0;
    public static String getPermutation(int n, int k) {
        String str = "";
        for(int i=1; i<=n; i++)
            str += i;
        return permuteKthSequence(str, k, "");
    }
    
    public static String permuteKthSequence(String str, int k, String kthSeq){
        if(str.length() == 0){
            count++;
            if(count == k)
                found = true;
        }
        else{
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                kthSeq += c;
                String newStr = str.substring(0, i) + str.substring(i+1, str.length());
                String kth = permuteKthSequence(newStr, k, kthSeq);
                if(found == true)
                    return kth;
                kthSeq = kthSeq.substring(0, kthSeq.length()-1);
            }
        }
        return kthSeq;  
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPermutation(9, 135401));
	}

}

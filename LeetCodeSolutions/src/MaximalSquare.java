/**
 * 
 */

/**
 * @author thejussinghj
 *
 */
public class MaximalSquare {

	public static int maximalSquare(char[][] matrix) {
        int max = 0;
        int[][] cache = new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                int val = Character.getNumericValue(matrix[i][j]);
                if(matrix[i][j] != '0' && i != 0 && j != 0){
                   val = Math.min(Math.min(cache[i][j-1], cache[i-1][j]), cache[i-1][j-1]) + 1; 
                }
                cache[i][j] = val;
                max = Math.max(max, val);
            }
        }
    
    return max*2;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
		System.out.println(maximalSquare(matrix));
		
	}

}

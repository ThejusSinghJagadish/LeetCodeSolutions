import java.util.HashSet;
import java.util.Set;

/**
 * 
 */

/**
 * @author thejussinghj
 *
 */
public class ValidSudoku {

	public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] != '.'){
                    String row = i + "[" + board[i][j] + "]";
                    String col = "[" + board[i][j]+"]" + j;
                    String block = i/3 + "[" + board[i][j] + "]" + j/3;
                    if(!set.contains(row) || !set.contains(col) || !set.contains(block)){
                        set.add(row);
                        set.add(col);
                        set.add(block);
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = new char[][]{{'.','.',},{},{},{},{},{},{},{},{}};
	}
	
//	[[".",".","4",".",".",".","6","3","."],[".",".",".",".",".",".",".",".","."],["5",".",".",".",".",".",".","9","."],[".",".",".","5","6",".",".",".","."],["4",".","3",".",".",".",".",".","1"],[".",".",".","7",".",".",".",".","."],[".",".",".","5",".",".",".",".","."],[".",".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".",".","."]]

}

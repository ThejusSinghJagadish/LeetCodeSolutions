/**
* 	Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
*
*	A region is captured by flipping all 'O's into 'X's in that surrounded region.
*
*	For example,
*	X X X X
*	X O O X
*	X X O X
*	X O X X
*
*	After running your function, the board should be:
*
*	X X X X
*	X X X X
*	X X X X
*	X O X X
* 
*/

/**
 * @author thejussinghj
 *
 */
public class SurroundedRegions {

	public static void solve(char[][] board) {
        boolean[][] visited;
        for(int i=1; i<board.length-1; i++){
            for(int j=1; j<board[0].length-1; j++){
                visited = new boolean[board.length][board[0].length-1]; 
                if(board[i][j] == 'O' && surrounded(visited, board, i, j)){
                    board[i][j] = 'X';
                } 
            }
        }
    }
    
    public static boolean surrounded(boolean[][] visited,char[][] board, int row, int col){
        if(row == board.length || col == board[0].length || row < 0 || col < 0)
            return false;
        
        if((board[row][col] == 'X' && !visited[row][col]) || visited[row][col])
            return true;
        
        visited[row][col] = true;
        
        if(surrounded(visited, board, row, col+1) && surrounded(visited, board, row, col-1) && surrounded(visited, board, row+1, col) && surrounded(visited, board, row-1, col))
            return true;
        
        visited[row][col] = false;
        
        return false;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = new char[][]{{'X', 'X', 'X', 'X'},{'X', '0', '0', 'X'}, {'X', 'X', '0', 'X'}, {'X', '0', 'X', 'X'}};
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[0].length; j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		solve(board);
		
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[0].length; j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
	}

}

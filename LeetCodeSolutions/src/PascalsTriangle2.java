import java.util.ArrayList;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.

	For example, given numRows = 5,
	Return

	[
     	    [1],
    	   [1,1],
   		  [1,2,1],
  		 [1,3,3,1],
 		[1,4,6,4,1]
	]
 */

/**
 * @author thejussinghj
 *
 */
public class PascalsTriangle2 {

	
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> list; 
        if(numRows >= 1){
            list = new ArrayList<>();
            list.add(1);
            finalList.add(list);
        }
        for(int i=1; i<numRows; i++){
            list = new ArrayList<>();
            list.add(1);
            for(int j=1; j<i; j++){
                list.add(finalList.get(i-1).get(j-1) + finalList.get(i-1).get(j));
            }
            list.add(1);
            finalList.add(list);
        }
        
        return finalList;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generate(5));
	}

}

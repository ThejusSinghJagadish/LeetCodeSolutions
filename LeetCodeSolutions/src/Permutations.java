import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author thejussinghj
 *
 */
public class Permutations {

	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        findCombination(nums, new ArrayList<Integer>(), list);
        return list;
    }
    
    public static void findCombination(int[] num, List<Integer> newList, List<List<Integer>> list){
        if(newList.size() == num.length){
            list.add(new ArrayList<Integer>(newList));
            return;
        }
        else{
            for(int i=0; i<num.length; i++){
                if(num[i] != Integer.MIN_VALUE){
                    int cur = num[i];
                    num[i] = Integer.MIN_VALUE;
                    newList.add(cur);
                    findCombination(num, newList, list);
                    num[i] = cur;
                    newList.remove(Integer.valueOf(cur));
                }
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = new ArrayList<>();
		int[] nums = new int[]{1,2,3};
		list = permute(nums);
		System.out.println(list);
	}

}

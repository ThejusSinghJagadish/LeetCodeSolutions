import java.util.Arrays;

/**
 * Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....

	For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3, 4].
 */

/**
 * @author thejussinghj
 *
 */
public class WiggleSort1 {

	public static void wiggleSort(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low < high){
            Arrays.sort(nums, low, nums.length);
            swap(nums, low+1, high);
            low += 2;
        }
    }
    
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{3, 5, 2, 1, 6, 4};
		wiggleSort(nums);
		
		for(int i=0; i<nums.length; i++)
			System.out.print(nums[i]+ " ");
	}

}

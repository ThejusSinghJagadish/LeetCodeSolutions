/**
 * Given an unsorted integer array, find the first missing positive integer.

	For example,
	Given [1,2,0] return 3,
	and [3,4,-1,1] return 2.

	Your algorithm should run in O(n) time and uses constant space.
 */

/**
 * @author thejussinghj
 *
 */
public class FirstMissingPositiveNumber {
	
	public static int firstMissingPositive(int[] nums) {
        int index = 0;
		int low = 0;
		int high = nums.length-1;
		while(low <= high){
			if(nums[low] <= 0){
				if(nums[high] > 0){
					swap(low, high, nums);
					low++;
				}
				high--;
			}
			else{
				low++;
			}
		}
		index = low;
		for(int i=0; i< index; i++){
			if(Math.abs(nums[i])-1 < index)
				nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
		}
		
		for(int i=0; i< index; i++){
			if(nums[i] > 0){
				index = i;
				break;
			}
		}
        return index+1;
    }
	private static void swap(int i, int j, int[] nums) {
		// TODO Auto-generated method stub
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{0,1,2};
		System.out.println(firstMissingPositive(nums));
	}

}

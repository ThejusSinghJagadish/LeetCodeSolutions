import java.util.Stack;

/**
 * 
 */

/**
 * @author thejussinghj
 *
 */
public class LargestRectangle {
	public static int largestRectangleArea(int[] heights) {
        int max = 0;
        if(heights.length == 0)
            return max;
        Stack<Integer> stack = new Stack<>();
        int i=0;
        while(i<heights.length){
            if(stack.isEmpty() || heights[i] >= heights[stack.peek()]){
                stack.push(i);
                i++;
            }
            else{
                int val = heights[stack.pop()];
                max = Math.max(max, val*(stack.isEmpty()?i:i-stack.peek()-1));
            }
        }
        
        while(!stack.isEmpty()){
            int val = heights[stack.pop()];
            max = Math.max(max, val*(stack.isEmpty()?i:i-stack.peek()-1));
        }
        
        return max;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights = new int[]{1, 1};
		System.out.println(largestRectangleArea(heights));
	}

}

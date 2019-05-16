package Array_bace;

public class A27_Remove_Element {
	class Solution {
	    public int removeElement(int[] nums, int val) {
	        if(nums.length == 0) return 0;
	        int reval = 0;
	        for(int i = 0; i < nums.length; i++) {
	        	if(nums[i] != val) {
	        	
	        		nums[reval] = nums[i];
	        		reval++;
	        	}
	        }
	        return reval;

	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

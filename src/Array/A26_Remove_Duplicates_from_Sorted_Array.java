package Array;

public class A26_Remove_Duplicates_from_Sorted_Array {
	class Solution {
	    public int removeDuplicates(int[] nums) {
	        if(nums.length < 0 || nums ==  null) return 0;
	        int res = 0;
	        for(int i = 0; i < nums.length; i++) {
	        	if(nums[i-1]!=nums[i]) {
	        		nums[res++] = nums[i];
	        	}
	        }
	        
	        return res;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

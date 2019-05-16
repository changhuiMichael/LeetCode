package Array_bace;

import java.util.HashSet;

public class A217_Contains_Duplicate {
	public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0) return true;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++) {
        	if (!set.add(nums[i])) return true;
        }
        return false;
        
        
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

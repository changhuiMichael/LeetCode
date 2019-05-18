package Array_bace;

import java.util.HashSet;

public class A128_Longest_Consecutive_Sequence {
	
	
	
	//解题思路：先把元素全部放到集合当中。
	//然后再次遍历一遍，左右数值搜索，该元素的最大连续值。
	public int longestConsecutive(int[] nums) {
		if(nums.length == 0) return 0;
		int res = 0;
		HashSet<Integer> set = new HashSet<>();
		for(int num:nums) {
			set.add(num);
		}
		for(int i = 0; i < nums.length; i++) {
			int down = nums[i] - 1;
			while(set.contains(down)) {
				set.remove(down);
				down--;
			}
			int up = nums[i] + 1;
			while(set.contains(up)) {
				set.remove(up);
				up++;
			}
			res = Math.max(res, up-down-1);
		}
		
		return res;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

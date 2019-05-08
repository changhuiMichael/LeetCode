package Array;

import java.util.HashMap;

public class A1_Two_sum {
	/*
	 * 使用hashmap，key存值，value存idnx。
	 * HashMap的创建方法：
	 * HashMap<Integer, Integer> map = new HashMap<>();
	 * HashMap.containskey() havekey
	 * HashMap.get()	Find_place
	 * 快速创建一个数组的方法，res = new int[]{1,2};
	 * 
	 * 编程思想，使用了HashMap键值对的方式。
	 * 结合数组的方式
	 */
	
	public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
        	return new int[] {-1, -1};
        }
        int[] res = new int[] {-1,-1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length;i++) {
        	if(map.containsKey(target-nums[i])) {
        		res[0] = map.get(target-nums[i]);
        		res[1] = i;
        		break;
        	}
        	map.put(nums[i], i);
        }
        return res;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

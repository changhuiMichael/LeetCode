package Array_bace;

public class A80_Remove_Duplicates_from_Sorted_Array_2 {
	public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        int res = 2;
        //遍历一遍
        
        for(int i = 2; i < nums.length;i++) {
        	if(nums[i] == nums[i-1]) {
        		if(nums[i] != nums[res-2]){//这个地方做错了，做这种两个指针的问题特别要注意每个指针指向的是什么东西。进行比较的话也要想清楚和那个指针所代表的东西比较。
        			nums[res++] = nums[i];
        		}
        		
        	}else {
        		nums[res] = nums[i];
        		res++;
        	}
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

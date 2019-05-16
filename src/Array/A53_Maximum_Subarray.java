package Array;
//动态规划，可复用原来的结果。（需要确定原来的对象是什么，是前面计算的最大值，是一个数）
public class A53_Maximum_Subarray {
	
	public int maxSubArray(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        int res = 0;
        int[] pd = new int[nums.length];
        pd[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
        	pd[i] = nums[i] + (pd[i-1] < 0? 0 : pd[i-1]);
        	res = Math.max(res, pd[i]);
        }
        
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

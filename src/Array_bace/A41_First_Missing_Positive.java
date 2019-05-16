package Array_bace;

public class A41_First_Missing_Positive {
	//找到第一个没有出现的正数
	//桶排序，对应的地方放对应的东西。
	//每个位置的值与坐标有一种对应关系。
	public int firstMissingPositive2(int A[]) {
		for (int i = 0; i < A.length; i++) {
			int desired = A[i] - 1; 
			// Set A[i] to position A[i] - 1. A[i] equals A[desired] will cause endless loop.
			if (desired >= 0 && desired < A.length && desired != i && A[i] != A[desired]) {
				swap(A, i, desired); i--;
			}
		}		
	    // Find the first missing positive integer.
		for (int i = 0; i < A.length; i++) 
			if (A[i] != i + 1) return i + 1;
		return A.length + 1;
	}
	public int firstMissingPositive(int[] nums) {
		if(nums.length == 0) return 1;
        for(int i = 0; i< nums.length; i++) {
        	if(nums[i] > 0&& nums[i] < nums.length-1&&nums[nums[i]-1]!=nums[i]) {
        		int temp = nums[i];
        		nums[i]=nums[nums[i]-1];
        		nums[nums[i]-1] = temp;
        		i--;
        	}
        }
        for(int i = 0; i<nums.length;i++) {
        	if(nums[i]!=i+1) {
        		return i+1;
        	}
        }
        return nums.length+1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

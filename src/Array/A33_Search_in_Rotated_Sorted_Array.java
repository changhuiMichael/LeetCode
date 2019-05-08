package Array;
//数组类型的题目解法：首尾——两端搜索解法。
//递归可以用while循环遍历，end>start
public class A33_Search_in_Rotated_Sorted_Array {
	public int search(int[] nums, int target) {
		if(nums.length == 0||nums == null) return -1;
		int start = 0;
		int end = nums.length - 1;
		int res = -1;
		while(start + 1 < end) {
			int mid = (end - start)/2 + start;
			if(nums[mid] == target) return mid;
			if(nums[start] < nums[mid]) {
				if(nums[start] <= target && nums[mid] >= target) {
					end = mid;
				}else {
					start = mid;
				}
			}else {
				if(nums[mid]<=target && target <= nums[end]) {
					start = mid;
				}else end = mid;
			}
		}
		if(nums[start]==target) return start;
		if(nums[end]==target)	return end;
		return res;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

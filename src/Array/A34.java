package Array;

public class A34 {
	public int[] searchRange(int[] nums, int target) {
		int[] res = new int[]{-1,-1};
		if(nums.length == 0) return res;
		int mid =0;
		int start = 0, end = nums.length-1;
		while(start < end) {
			mid = (end-start)/2;
			if(nums[mid] == target) {
				res = find_return(nums,mid);
			}
			if(nums[mid] > target) {
				end = mid;
			}else {
				start = mid;
			}
		}      
        return res;
    }

	private int[] find_return(int[] nums, int mid) {
		// TODO Auto-generated method stub
		int[] res = new int[]{-1,-1};
		int start = mid - 1;
		int end = mid + 1;
		while((start > 0 || end < nums.length)&&(start < end)) {
			if(nums[start] == nums[mid]) {
				res[0] = start;
				start--;
			}
			if(nums[end] == nums[mid]) {
				res[1] = end;
				end--;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,7,7,8,8,10};
		int b =8;
		System.out.println();
	}

}

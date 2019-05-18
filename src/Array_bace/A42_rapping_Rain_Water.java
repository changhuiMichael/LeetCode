package Array_bace;

public class A42_rapping_Rain_Water {
	
	//双指针解决方法
	public int trap(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length - 1;
        int Maxleft = 0;
        int Maxright = 0;
        while(left < right) {
        	if(height[left] < height[right]) {
        		//确定左边最大值，这样就可以计算差值的高度。
        		Maxleft = Math.max(height[left], Maxleft);
        		res += (Maxleft - height[left]);
        		left++;
        	}else {
        		Maxright = Math.max(height[right], Maxright);
        		res += (Maxright - height[right]);
        		right--;
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

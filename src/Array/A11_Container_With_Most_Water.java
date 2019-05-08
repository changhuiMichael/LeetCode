package Array;

//首尾逼近的方法
public class A11_Container_With_Most_Water {
	class Solution {
	    public int maxArea(int[] height) {
	        int r = height.length-1;
	        int l = 0;
	        int res = 0;
	        while(l < r) {
	        	res = Math.max(res, Math.min(height[l], height[r])*(r-l));
	        	if(height[l] < height[r]) {
	        		l++;
	        	}else r--;
	        }
	        
	        return res;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

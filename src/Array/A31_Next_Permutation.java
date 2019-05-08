package Array;
//解题思路：知道一个数的下一个最大的数是什么。
public class A31_Next_Permutation {
	public void nextPermutation(int[] nums) {
        if(nums.length == 0) return;
        int firstsmall = -1;
        for( int i = nums.length -2;i >=0; i--) {
        	if(nums[i] < nums[i+1]) {
        		firstsmall = i;
        		break;
        	}
        }
        if(firstsmall == -1) {
        	//翻转
        	resverse(nums,0,nums.length-1);
        	return;
        }
        //找到后面顺序的最小的
        for(int j = nums.length-1; j>0;j--) {
        	if(nums[j] > nums[firstsmall]) {
        		swap(nums,firstsmall,j);
        		break;
        	}
        }
        //交换元素
        //翻转序列
        resverse(nums,firstsmall+1,nums.length-1);
        return;
    }
	

	public void resverse(int[] nums, int i,int j) {
		// TODO Auto-generated method stub
		while(i < j) {
			swap(nums,i++,j--);
		}
	}


	public void swap(int[] nums,int i, int j) {
		// TODO Auto-generated method stub
		int k = nums[i];
		nums[i++] = nums[j];
		nums[j--] = k;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

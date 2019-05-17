package Array_bace;

public class A55_A45_JumpGame {
	public boolean A55canJump(int[] nums) {//可以走一步，也可以走多步。
		int max = 0;
        for(int i = 0; i < nums.length;i++) {//可以看成两个指针，一个是每次走一步，一个是跳跃方式（max选择跳得远的方式）。如果跳在一个点不动了。就返回false；
        	if(i > max) return false;
        	max = Math.max(max, i+nums[i]);//贪婪策略，记录跳得最远的节点。跳的最远的节点都不ok的话，就一定不ok；
        }
        
        
        return true;
		
		
		
    }
	
	//找到跳的步骤最短的策略。（可以看作一颗树结构）
	public int A45jump(int[] nums) {
		//从起始位置开始数组内的值加和为nums.length
        if(nums.length < 2) return 0;
        int res = 0;
        int curMaxmove = 0;
        int Maxnext = 0;//
        for(int i = 0;i<nums.length-1;i++) {
        	Maxnext = Math.max(Maxnext, nums[i]+i);//贪婪策略选择最大的一个标记位置，并且复用之前的内容。
        	if(curMaxmove == i) {
        		res++;
        		curMaxmove = Maxnext;
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

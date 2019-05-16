package Array_bace;

public class A277_Find_the_Celebrity {
	public int findcelebruty(int n) {
		if(n < 2) return -1;
		int res = 0;
		for(int i = 1; i < n; i++) {//发现形式不对就立刻变换，并且复用前面的结果
			if(knows(res,i)) {
				res = i;
			}
		}
		
		for(int i = 0; i<n; i++) {
			if(res!=i && (knows(res,1)||!knows(i,res))) return -1;
		}
		
		return res;
	}
	
	
	
	public boolean knows(int a,int b) {
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

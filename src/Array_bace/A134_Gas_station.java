package Array_bace;

public class A134_Gas_station {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		if (gas.length == 0 || cost.length == 0 || gas.length != cost.length) return -1;
		int start = 0;
        int total = 0;
        int remain = 0;
        
        
        //遍历一遍
        for(int i = 0; i < gas.length;i++) {
        	total += (gas[i]-cost[i]);
        	if(remain < 0) {
        		total = gas[i] - cost[i];
        		start = i;
        	}else {
        		remain+=(gas[i] - cost[i]);
        	}
        	
        }
        
       return total < 0 ? -1 : start;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

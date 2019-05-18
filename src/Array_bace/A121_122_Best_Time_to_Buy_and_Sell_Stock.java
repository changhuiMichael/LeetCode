package Array_bace;

public class A121_122_Best_Time_to_Buy_and_Sell_Stock {
	//想象成波浪
	public int A121maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int res = 0;
        int min = prices[0];
        for(int i = 1; i < prices.length; i++) {
        	min = Math.min(prices[i], min);
        	res = Math.max(res, prices[i]-min);
        }
        return res;
    }
	//后一个比前一个要大，加上收益就可以
	public int A122maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int res = 0;
        for(int i = 0; i < prices.length-1; i++) {
        	if(prices[i] < prices[i+1]) {
        		res = res + (prices[i+1]+prices[i]);
        	}
        }
        return res;
    }
	//记录每次上涨的波峰，
	public int A123maxProfit(int[] prices) {
		if(prices.length < 2) return 0;
        int res = 0;
        int min = prices[0];
        int max = 0;
        for(int i = 1; i < prices.length; i++) {
        	//nums【i】<min;更新min
        	//num[i] >min,判断是否大于max，大于max更新max。比max要小的话，卖出。得到收益。
        	if(prices[i] <= min) {
        		min = prices[i];
        	}else {
        		if(prices[i] >= max) {
        			max = prices[i];
        		}
        		else {
        			res = res + (max-min);
        			min = prices[i];
        			max = 0;
        		}
        	}
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

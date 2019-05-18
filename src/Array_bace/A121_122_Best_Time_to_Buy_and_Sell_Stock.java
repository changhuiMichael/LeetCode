package Array_bace;

public class A121_122_Best_Time_to_Buy_and_Sell_Stock {
	//想象成波浪
	public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int res = 0;
        int min = prices[0];
        for(int i = 1; i < prices.length; i++) {
        	min = Math.min(prices[i], min);
        	res = Math.max(res, prices[i]-min);
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public int maxProfit(int[] prices) {
        int minBuy=Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0;i<prices.length;i++){
            minBuy = Math.min(prices[i],minBuy);
            maxprofit = Math.max(maxprofit, prices[i] - minBuy);

        }
        return maxprofit;
}
}
class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0;
        int l = 0;
        int r = 1;
        while(r < prices.length){

            if (prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxp = Math.max(maxp, profit);
                // l+=1;
            }
            else{
                l = r;
            }
            r++;
        }
        return maxp;
    }
}

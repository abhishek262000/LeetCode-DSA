class Solution {
    public int maxProfit(int[] prices) {
        int max=0, size=0;
        for(int i=0; i<prices.length-1; i++){
            int j = prices.length-1;
            while(i<j){
                max = Math.max(max, prices[j]-prices[i]);
                j--;
            }
        }
        return max;
    }
}
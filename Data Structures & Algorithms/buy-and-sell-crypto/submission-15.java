class Solution {
    public int maxProfit(int[] prices) {
        
        int l =0 , r = 1;
        int res = 0 ;
                 
        while(r<prices.length){
        
        res = Math.max(res , prices[r]-prices[l]);
        if(prices[r] < prices[l])l=r ;
        r++ ;
        
        }
        return res ;
    }
}

class Solution {
  //Brute force
  public int maxProfit(int[] prices) {
    int profit = 0;
    for(int i =0; i < prices.length; i++){
      for(int j=i+1; j < prices.length; j++){
        if(prices[j] > prices[i]){
            profit = Math.max(profit, (prices[j]-prices[i]));
        }
      }
    }
    return profit;
  }

    //one way pass
    /*
    The points of interest are the peaks and valleys in the given graph. We need to
   find the largest peak following the smallest valley. We can maintain two 
   variables - minprice and maxprofit corresponding to the smallest valley and 
   maximum profit (maximum difference between selling price and minprice) obtained 
   so far respectively.
    */

  public int maxProfit(int[] prices){
    int maxProfit = 0;
    int minPrice = Integer.MAX_VALUE;

    for(int i =0; i < prices.length; i++){
      if(prices[i] < minPrice){
        minPrice = prices[i];
      }
      else if(prices[i] - minPrice >  maxProfit){
        maxProfit = prices[i] - minPrice;
      }
    }
    return maxProfit;
    
  }

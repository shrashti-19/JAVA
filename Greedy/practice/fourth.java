public class fourth{
    public static int buySellStock(int prices[],int n){
        int bp = prices[0];
        int maxProfit = 0;
        for(int i=1 ; i<n ; i++){
            int sp = prices[i];
            if(sp>bp){
                int profit = sp-bp;
                maxProfit = Math.max(profit,maxProfit);
            }else{
                bp=sp;
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]  = {7,1,5,3,6,4};
        int n = prices.length;
        System.out.println("Maximum profit is  : " + buySellStock(prices,n));
    }
}
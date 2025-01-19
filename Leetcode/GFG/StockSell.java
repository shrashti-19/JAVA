public class StockSell{
    //multiple transcations
    public static int stock(int prices[]){
        int maxProfit=0;
        for(int i=1 ; i<prices.length ; i++){
            if(prices[i]>prices[i-1]){
                maxProfit+= prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int prices[] = {100,180,260,310,40,535,695};
        System.out.println(stock(prices));
    }
}
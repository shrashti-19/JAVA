public class stock{
    public static int maxProfitStock(int []prices){
        int BP = prices[0];
        int maxProfit=0;
        for(int i=1 ; i<prices.length ; i++){
            int SP = prices[i];
            if(SP<BP){
                BP=SP;
            }else{
                int profit = SP-BP;
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int []prices = {1,2};
        System.out.println("Maximum profit is "+maxProfitStock(prices));
    }
}
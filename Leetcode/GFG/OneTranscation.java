public class OneTranscation{
    public static int Transcation(int prices[]){
        int bp = prices[0];
        int maxProfit = 0;
        for(int i=0 ; i<prices.length ; i++){
            int sp=prices[i];
            if(sp>bp){
                int profit = sp-bp;
                maxProfit = Math.max(maxProfit,profit);
            }else{
                bp=sp;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,10,1,3,6,9,2};
        System.out.println(Transcation(prices));
    }
}
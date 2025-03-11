
import java.util.ArrayList;

public class stock{
    public static int maximumProfit(ArrayList<Integer> prices){
        int maxProfit = 0;
        int bp = prices.get(0);
        for(int i=1 ; i<prices.size() ; i++){
            int sp = prices.get(i);
            if(sp>bp){
                int profit = sp-bp;
                maxProfit = Math.max(profit,maxProfit);
            }else{
                bp = sp;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(2);
        prices.add(100);
        prices.add(150);
        prices.add(120);
        System.out.println("Maximum profit is : "+ maximumProfit(prices));

    }
}
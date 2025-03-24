
import java.util.*;

public class indianCoins{
    public static void main(String args[]){
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        //sorting so that maximum coin appears on the first
        Arrays.sort(coins, Comparator.reverseOrder());
        int value = 590;
        int count = 0;
        for(int i=0 ; i<coins.length ; i++){
            if(value >=coins[i]){
                while(value>=coins[i]){
                    count++;
                    value = value - coins[i];
                }
            }
        }
        System.out.println("Number of coins or notes taken for exchange : " + count);
        
    }
}
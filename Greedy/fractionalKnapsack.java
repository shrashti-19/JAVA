
import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapsack{
    public static void main(String args[]){
        int weight[] = {10,20,30};
        int value[] = {60,100,120};
        int weightKnapsack = 50;

        //ratio 2d array
        double ratio[][] = new double[value.length][2];
        // 0 for index and 1 for ratio
        for(int i=0 ; i<value.length ; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        int finalValue = 0;
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); // gives in ascending order

        for(int i = ratio.length-1 ; i>=0 ; i--){
            int index = (int)ratio[i][0];
            if(weightKnapsack >= weight[index]){
                finalValue += value[index];
                weightKnapsack-=weight[index];
            }else{
                finalValue+=weightKnapsack*ratio[i][1];
                break;
            }
        }
        System.out.println("Final maximum value :"+finalValue);
    }

}
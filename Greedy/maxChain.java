import java.util.*;

public class maxChain{
    public static void main(String args[]){
        int pairs[][] = {{5,24},
                        {39,60},
                        {5,28},
                        {27,40},
                        {50,90}
        };
        Arrays.sort(pairs , Comparator.comparingDouble(o->o[1])); //24->28->40->60->90
        int chainLength = 0; //first pair already added
        int lastEnd = pairs[0][1];
        ArrayList<int []> ans = new ArrayList<>();
        chainLength = 1;
        ans.add(pairs[0]);
        for(int i=0 ; i<pairs.length ; i++){
            //non overlapping condition
            if(pairs[i][0]>lastEnd){
                chainLength++;
                ans.add(pairs[i]);
                lastEnd = pairs[i][1];
            }
        }
        System.out.println("maximum chain length : " + chainLength);
        
        for(int[] pair : ans){
            System.out.println("[" + pair[0] + "," + pair[1] + "]");
        }
        System.out.println();
    }
}
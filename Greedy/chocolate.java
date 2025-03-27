import java.util.*;
public class chocolate{
    public static void main(String args[]){
        Integer[] costVertical = {4,1,2};
        Integer[] costHorizontal = {2,1,3,1,4};
        int h=0,v=0;
        int hp=1,hv=1;
        int finalCost = 0;
        Arrays.sort(costHorizontal,Collections.reverseOrder()); // descending order
        Arrays.sort(costVertical , Collections.reverseOrder());
        while(h<costHorizontal.length && v<costVertical.length){
            if(costHorizontal[h]<=costVertical[v]){
                finalCost+=costVertical[v]*hp;
                v++;
                hv++;
                
            }else{
                finalCost+=costHorizontal[h]*hv;
                h++;
                hp++;
            }
        }
        //remaining parts
        while(h<costHorizontal.length){
            finalCost+=costHorizontal[h]*hv;
            hp++;
            h++;
        }
        while(v<costVertical.length){
            finalCost+=costVertical[v]*hp;
            hv++;
            v++;
        }

        System.out.println("Final cost is : "+ finalCost);

    }
}
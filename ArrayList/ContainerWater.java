
import java.util.ArrayList;

public class ContainerWater{
    public static int maxArea(ArrayList<Integer>list){
       int maxArea=0;
       int lp=0;
       int rp = list.size()-1;
       while(lp<rp){
        int height = Math.min(list.get(lp),list.get(rp)); 
        int weight = rp-lp;
        int area = height*weight;
        maxArea = Math.max(area,maxArea);

        if(list.get(lp)<list.get(rp)){
            lp++;
        }else{
            rp--;
        }
              
       }
       return maxArea;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(maxArea(list));
    }
}
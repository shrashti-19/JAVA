
import java.util.ArrayList;
import java.util.Collections;

public class Sorting{
   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(8);
       list.add(2);
       list.add(1);
       list.add(12);
       list.add(-1);

       Collections.sort(list);
       System.out.println(list);

       Collections.sort(list,Collections.reverseOrder());
       //compartor-logic define 
       System.out.println(list);
    
   }
}

import java.util.ArrayList;

public class Basics{
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        ArrayList<Integer> list  = new ArrayList<>();
        //first add operation -> O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        int element = list.get(2);
        System.out.println(element);

        list.set(2,10);
        System.out.println(list);

        System.out.println(list.contains(10));

        list.add(1,9);
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0 ; i<list.size() ; i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
        
    }
}
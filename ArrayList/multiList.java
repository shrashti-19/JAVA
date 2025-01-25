
import java.util.ArrayList;

public class multiList{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1 ; i<=5 ; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);

        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        list2.remove(3);
        list1.remove(2);
        System.out.println(mainList);

        //nested loops for printing the 3 lists

        for(int i=0 ; i<mainList.size() ; i++){
            ArrayList<Integer> curr = mainList.get(i);
            for(int j=0 ; j<curr.size() ; j++){
                System.out.print(curr.get(j)+ " ");
            }
            System.out.println();
        }
        // ArrayList<Integer> arr = new ArrayList<>();

        // arr.add(2);
        // arr.add(3);
        // arr.add(2);

        // mainList.add(arr);

        // ArrayList<Integer> arr2 = new ArrayList<>();
        // arr2.add(-1);
        // arr2.add(8);
        // arr2.add(1);

        // mainList.add(arr2);

        // //System.out.println("Multi list are : " + mainList);

        // //main list ke upar traverse krke ek ek list ko find 
        // for(int i=0 ; i<mainList.size() ; i++){
        //     //current list
        //     ArrayList<Integer> currList = mainList.get(i); //whole list
        //     for(int j=0 ; j<currList.size() ; j++){
        //         System.out.print(currList.get(j)+ " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(mainList);
    }
}
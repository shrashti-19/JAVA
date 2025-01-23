
import java.util.ArrayList;

public class Reverse{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //printing the reverse of a arraylist
        System.out.println("Adding the elements for arraylist");
        for(int i=0 ; i<=4 ; i++){
            list.add(i);
        }
        System.out.println(list);

        //reverse 
        for(int i=list.size()-1 ; i>=0 ; i--){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }
}
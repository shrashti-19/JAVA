// code for adding the element and fixing the heap after that
import java.util.*;

public class first{
    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();

        void add(int data){
            arr.add(data);

            //data is stored in the last position in the array list.
            int x = arr.size()-1; // index of child
            int parent = (x-1)/2; // index of parent 
            while(arr.get(x) < arr.get(parent)){
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
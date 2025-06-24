// code for adding the element and fixing the heap after that
import java.util.*;

public class first{
    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);

            //data is stored in the last position in the array list.
            int x = arr.size()-1; // index of child
            int parent = (x-1)/2; // index of parent 
            while(arr.get(x) < arr.get(parent)){
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

                x= parent;
                parent = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        public void print(){
            System.out.println("Current heap: " + arr);
        }
    }

    public static void main(String[] args) {
        heap minHeap = new heap();

        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(3);

        minHeap.print();

        System.out.println("Minimum element from the heap is: "+ minHeap.peek());
    }
}
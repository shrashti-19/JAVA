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

        //deleting the element from a heap
        public int delete(){
            int data = arr.get(0);
            //step:1 -> swap the last and first index of the arraylist
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            // step:2 -> delete the last element from the arraylist
            arr.remove(arr.size()-1);

            //step:3 -> heapify ->O(logn)

            heapify(0);
            return data;
        }
        private void heapify(int index){
            int leftchild = 2*index+1;
            int rightchild = 2*index+2;
            int minIdx = index;
            //finding the minimum from index, leftchild,rightchild
            //checking whether both left and right childs are not leaf nodes
            if(leftchild< arr.size()-1 && arr.get(minIdx)> arr.get(leftchild) ){
                minIdx = leftchild;
            }
            if(rightchild< arr.size()-1 && arr.get(minIdx)> arr.get(rightchild)){
                minIdx = rightchild;
            }

            // swap when i is not equal to minIdx
            if(minIdx!=index){
                int temp = arr.get(index);
                arr.set(index, arr.get(minIdx));
                arr.set(minIdx, temp);

                //if other values are disturbed
                heapify(index);
            }

        }
        public int peek(){
            return arr.get(0);
        }

    

        public boolean isEmpty(){
            return arr.isEmpty();
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

        minHeap.delete();
        minHeap.print();

        System.out.println("Minimum element from the heap is: "+ minHeap.peek());
    }
}
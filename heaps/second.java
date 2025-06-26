
import java.util.ArrayList;

public class second{
    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x = arr.size()-1; //children index
            int parent = (x-1)/2; //parent index
            while(arr.get(x)<arr.get(parent)){
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

                x = parent;
                parent =(x-1)/2;
            }
        }
        public void print(){
            System.out.println("Current heap is: " +arr);
        }

        public void heapsort(int array[]){
            //step:1 -> array se maxheap banana
            int n= array.length;
            for(int i=n/2 ; i>=0 ; i--){
                heapify(array,i,n);
            }

            //step:2 -> pushing the largest element to the last;
            // maxheap se largest element first step phir swap krenge first and last index ko
            for(int i=n-1 ; i>=0 ; i--){
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;

                //fixing the heap by doing heapify 
                heapify(array,0,i); // i beacause the size gets reduced by 1 due to pushing of the largest element
            }
        }

        private void heapify(int array[], int index, int size){
            int leftchild = 2*index+1;
            int rightchild = 2*index+2;

            // max heap aaya toh we will do maxindx thing
            int maxIdx = index;
            if(leftchild<size && array[leftchild]> array[maxIdx]){
                maxIdx = leftchild;
            }
            if(rightchild< size && array[rightchild]> array[maxIdx]){
                maxIdx = rightchild;
            }

            // maxidx is not equal to index
            if(maxIdx!=index){
                //swap 
                int temp = array[index];
                array[index] = array[maxIdx];
                array[maxIdx] = temp;

                heapify(array, maxIdx, size); 
            }
        }
    }
    public static void main(String[] args) {
        heap minHeap = new heap();
        // minHeap.add(1);
        // minHeap.add(2);
        // minHeap.add(5);
        // minHeap.add(4);
        // minHeap.print();
        int array[] = new int[]{1,2,4,5,3};
        minHeap.heapsort(array);
         System.out.print("Sorted array is: ");
        for (int num : array) {
        System.out.print(num + " ");
        }
    }
}
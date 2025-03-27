import java.util.*;
public class rotateList {
    public static LinkedList<Integer> rotateList(LinkedList<Integer> l1 , int k){

        k = k % l1.size(); // Handle cases where k is greater than the size of the list
        for (int i = 0; i < k; i++) {
            l1.addFirst(l1.removeLast()); // Rotate the list by moving the last element to the front
        }
        return l1;
    }
    public static void main(String args[]){
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(0);
        l1.add(1);
        l1.add(2);
        int k = 2; //no.of times to be rotated
        System.out.println(rotateList(l1,k));
    }
}
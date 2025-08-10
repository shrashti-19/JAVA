import java.util.*;


public class question2{
    public static int findUnion(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0  ; i<arr1.length ; i++){
            set.add(arr1[i]);
        }

        for(int i=0 ; i<arr2.length ; i++){
            set.add(arr2[i]);
        }

        return set.size();
    }

    public static int findIntersection(int[]arr1, int[]arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0 ; i<arr1.length ; i++){
            set.add(arr1[i]);
        }

        int count = 0;
        for(int i=0 ; i<arr2.length ; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]arr1 = {7,3,9};
        int []arr2 = {6,3,9,2,4};

        int result1 = findUnion(arr1,arr2);
        int result2 = findIntersection(arr1,arr2);

        System.out.println(result1 + ", " +  result2);

    }
}
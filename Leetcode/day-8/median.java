
import java.util.ArrayList;

public class median{
     public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> nums3 = new ArrayList<>();
        int i=0; //pointer for first array
        int j=0; // pointer for 2nd array
        int k = 0; //pointer for 3rc array
        //SORTING FOR BOTH THE ARRAYS
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                nums3.add(nums1[i]);
                i++;
                k++;
            }else{
                nums3.add(nums2[j]);
                j++;
                k++;
            }
        }
        //remaining elements 
        while(i<n){
            nums3.add(nums1[i]);
            i++;
            k++;
        }
        while(j<m){
            nums3.add(nums2[j]);
            j++;
            k++;
        }

        // ARRAY IS = {1,2,3}
        // MEDIAN FOR ODD = N/2 
        //MEDIAN FOR EVEN = N+1/2
        int size = nums3.size();
        double median;
        if (size % 2 == 1) {
            median = nums3.get(size / 2);
        } else {
            median =  (nums3.get(size / 2 - 1) + nums3.get(size / 2)) / 2.0;
        }
        return median;
     }
     public static void main(String[] args) {
        int nums1[] = {1,2};
        int nums2[] = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
     }
}
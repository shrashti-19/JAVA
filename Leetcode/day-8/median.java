
// import java.util.ArrayList;

// public class median{
//      public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n = nums1.length;
//         int m = nums2.length;
//         ArrayList<Integer> nums3 = new ArrayList<>();
//         int i=0; //pointer for first array
//         int j=0; // pointer for 2nd array
//         int k = 0; //pointer for 3rc array
//         //SORTING FOR BOTH THE ARRAYS
//         while(i<n && j<m){
//             if(nums1[i]<nums2[j]){
//                 nums3.add(nums1[i]);
//                 i++;
//                 k++;
//             }else{
//                 nums3.add(nums2[j]);
//                 j++;
//                 k++;
//             }
//         }
//         //remaining elements 
//         while(i<n){
//             nums3.add(nums1[i]);
//             i++;
//             k++;
//         }
//         while(j<m){
//             nums3.add(nums2[j]);
//             j++;
//             k++;
//         }

//         // ARRAY IS = {1,2,3}
//         // MEDIAN FOR ODD = N/2 
//         //MEDIAN FOR EVEN = N+1/2
//         int size = nums3.size();
//         double median;
//         if (size % 2 == 1) {
//             median = nums3.get(size / 2);
//         } else {
//             median =  (nums3.get(size / 2 - 1) + nums3.get(size / 2)) / 2.0;
//         }
//         return median;
//      }
//      public static void main(String[] args) {
//         int nums1[] = {1,2};
//         int nums2[] = {3,4};
//         System.out.println(findMedianSortedArrays(nums1,nums2));
//      }
// }

public class median{
    public static double findMedianSortedArrays(int nums1[],int nums2[]){
        int n = nums1.length;
        int m = nums2.length;
        if(n>m){
            return findMedianSortedArrays(nums2, nums1);
        }
        int low =0 ;
        int high = n;
        while(low<=high){
            int midX = (low+high)/2;
            int midY = (n+m+1)/2 - midX;
            int leftX = (midX == 0) ? Integer.MIN_VALUE : nums1[midX - 1];
            int rightX = (midX==n) ? Integer.MAX_VALUE : nums1[midX];

            int leftY = (midY==0) ? Integer.MIN_VALUE : nums2[midY-1];
            int rightY = (midY==m) ? Integer.MAX_VALUE : nums2[midY];

            if(leftX<=rightY && leftY <= rightX){
                if((n+m)%2==0){
                    return (Math.max(leftX,leftY)+Math.min(rightX,rightY))/2.0;
                }else{
                    return Math.max(leftX, leftY);
                }
            }else if(leftX>rightY){
                high = midX-1;
            }else{
                low = midX+1;
            }
        }
        return 0.0;
    }
    public static void main(String[] args) {
        int nums1[] = {1,3,8};
        int nums2[] = {7,9,10,11};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
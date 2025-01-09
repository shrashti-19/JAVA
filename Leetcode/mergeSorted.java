



public class mergeSorted{
    public static void mergeSortedArray(int nums1[],int nums2[],int m,int n){
       int p1 = m-1;
       int p2 = n-1;
       int p = m+n-1;
       while(p1>=0 && p2>=0){
        if(nums1[p1] < nums2[p2]){
           nums1[p--] = nums2[p2--];
        }
        else{
            nums1[p--] = nums1[p1--];
        }
       }
       //if there are elements remaning in nums2 copy directly into nums1
       while(p2>=0){
        nums1[p--] = nums2[p2--];
       }
        
    }
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int m=3;
        int n=3;
        mergeSortedArray(nums1, nums2, m, n);
        // System.out.println(nums1);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
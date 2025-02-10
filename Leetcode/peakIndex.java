public class peakIndex{
    public static int peakArrayIndex(int [] arr){
        int left =0;
        int right = arr.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(arr[mid]<arr[mid+1]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0};
        System.err.println(peakArrayIndex(arr));
    }
}
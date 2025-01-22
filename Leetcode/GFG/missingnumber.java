public class missingnumber{
     public static  int missing(int[] arr) {
        // Your code here
        int missing=-1;
        int n=arr.length;
        int count[] = new int[n+1];
        for(int i=0 ; i<n; i++){
            if(arr[i]>0 && arr[i]<=n){
                count[arr[i]]=1;
            }
        }
        for(int i=1 ; i<=n ; i++){
            if(count[i]==0){
                return i;
            }
        }
        return n+1;
    }
    public static void main(String[] args) {
        int arr[]={2,-3,4,1,1,7};
        System.out.println(missing(arr));
    }
}

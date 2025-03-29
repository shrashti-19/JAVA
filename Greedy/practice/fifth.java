

public class fifth{
    public static int ans = 10000;
    public static void solve(int a[],int n , int k, int index, int sum,int maxSum){
        if(k==1){
            maxSum=Math.max(sum,maxSum);
            sum=0;
            for(int i=index ; i<n ; i++){
                sum+=a[i];
            }
            maxSum  = Math.max(sum,maxSum);
            ans = Math.min(ans,maxSum);
            return;
        }
        sum=0;
        for(int i=index ; i<n; i++){
            sum+=a[i];
            maxSum = Math.max(maxSum,sum);
            solve(a,n,k-1,i+1,sum,maxSum);
        }
    }
    public static void main(String args[]){
        int a[] = {1,2,3,4};
        int n = a.length;
        int k = 3;
        solve(a,n,k,0,0,0);
        System.out.println("ans is :" + ans);
    }
}
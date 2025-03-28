public class second{
    public static int kthLargest(int L, int R, int k){
        int largest_odd = 0;
        int smallest_odd = 0;
        if(R%2!=0){
            largest_odd = R;
        }else{
            R=R-1;
        }
        if(L%2!=0){
            smallest_odd = L;
        }else{
            L=L+1;
        }
        int total_count = (largest_odd-smallest_odd)/2+1;
        int kth = largest_odd - (k-1)*2;
        if(k>total_count){
            return -1;
        }
        return kth;
    }
    public static void main(String[] args) {
       int L = 1, R=2;
       int k = 1;
       System.out.println(kthLargest(L,R,k));
    }
}
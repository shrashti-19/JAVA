
import java.util.Arrays;

public class mergeTwo{
    public static void mergeTwoSortedArrays(long a[], long b[], int N, int M ){
       int i = N-1;
       int j = 0;
       while(i>=0 && j<M){
        if(a[i]>b[j]){
            long temp = a[i];
            a[i] = b[j];
            b[j] = temp;
           
        }
        i--;
        j++;
       }
       Arrays.sort(a);
       Arrays.sort(b);
    }

    public static void print(long a[], long b[]){
       for (long num : a) {
            System.out.print(num + " ");
        }

        // Print array B
        for (long num : b) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        long a[] = {1,4,5,7};
        long b[] = {2,3,6};
        int N = a.length;
        int M = b.length;
        mergeTwoSortedArrays(a,b,N,M);
        print(a,b);
    }
}
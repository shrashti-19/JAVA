public class problem5{
    public static int fibonacciNth(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        fibonacciNth(n-1);
        fibonacciNth(n-2);
        int fibo = fibonacciNth(n-1)+fibonacciNth(n-2);
        return fibo;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacciNth(n));
    }
}
public class friendsPairing{
    public static int friendsPair(int n){
        if(n==1 || n==2){
            return n;
        }
        int single = friendsPair(n-1);
        int pairs = friendsPair(n-2);
        int total_ways = single + (n-1)*pairs;
        return total_ways;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println("total ways are : "+friendsPair(n));
    }
}
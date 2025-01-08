public class problem8{
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        power(x, n-1);
        int pow = x*power(x, n-1);
        return pow;
    }
    public static int power2(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPower = power2(x,n/2);
        int halfpowerSq =  halfPower * halfPower;
        // if n is odd
        if(n%2!=0){
            halfpowerSq = x*halfpowerSq;
        }
        return halfpowerSq;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        //System.out.println(power(x,n));
        System.out.println(power2(x, n));

    }
}
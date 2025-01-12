public class power{
    public static int powerxton(int x , int n){
        //base case 
        if(n==0){
            return 1;
        }
        int halfPower = powerxton(x, n/2);
        int halfPowerSquare = halfPower*halfPower;
        if(n%2!=0){
            halfPowerSquare = x*halfPowerSquare;
        }
        return halfPowerSquare;
    }
    public static void main(String[] args) {
        int x=2;
        int n=3;
        System.out.println(powerxton(x,n));
    }
}
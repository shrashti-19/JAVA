public class third{
    public static String stringGenerated(int N, int K){
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int remainingSum = 0;
        for(int i=0 ; i<N ; i++){
            sb.append('a');
           
        }
        sum = N;
        remainingSum = K- N;
        //rightmost character
        for(int i = N-1 ; i>=0 ; i--){
            if(remainingSum>=25){
                sb.setCharAt(i, 'z');
                remainingSum-=25;
            }else{
                sb.setCharAt(i, (char) ('a' + remainingSum)); //till remaining sum equals 0
                break;
            }
        }
        return sb.toString();


    }
    public static void main(String args[]){
        int N = 5 , K=42;
        System.out.println("String generated is : "+stringGenerated(N,K));
    }
}
public class fivth{
    public static int countsubStr(String str,int i,int j,int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int result = countsubStr(str, i+1, j, n-1)
        +countsubStr(str, i, j-1, n-1)
        -countsubStr(str, i+1, j-1, n-2);
        if(str.charAt(i)==str.charAt(j)){
            result++;
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "abcab";
        int n=str.length();
        int i=0;
        int j = n-1;
        System.out.println(countsubStr(str,i,j,n));
    }
}
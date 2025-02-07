public class greatestDivisior{
    public static int gcd(int n , int m){
        if(m==0){
            return n;
        }
        return gcd(m,n%m);
    }
    public static String gcdOfStrings(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int gcds = gcd(n,m);
        String candidate = str1.substring(0, gcds);
        if (str1.equals(candidate.repeat(n / gcds)) && str2.equals(candidate.repeat(m / gcds))) {
         return candidate;
        }
        return "";

    }
    public static void main(String[] args) {
        String str1 = "LEET";
        String str2 = "CODE";
        System.out.println(gcdOfStrings(str1, str2));
    }
}
public class problem3{
    public static int findfactorial(int n){
        if(n==1){
            return 1;
        }
        findfactorial(n-1);
        int fact = n * findfactorial(n-1);
        return fact;

    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(findfactorial(n));
    }
}
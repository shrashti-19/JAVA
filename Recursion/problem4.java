public  class problem4{
    public static int sumofNaturalNumbers(int n){
        if(n==1){
            return 1;
        }
        sumofNaturalNumbers(n-1);
        int sum = n + sumofNaturalNumbers(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(sumofNaturalNumbers(n));
    }
}
public class second{
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int numbers){
        if(numbers==0){
            return;
        }
        int lastdigits = numbers%10;
        printDigits(numbers/10);
        System.out.println(digits[lastdigits]);
    }
    public static void main(String[] args) {
        printDigits(1234);
    }
}
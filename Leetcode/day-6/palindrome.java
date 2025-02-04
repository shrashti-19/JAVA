public class palindrome{
    public static String reverse(String result){
        StringBuilder reversed = new StringBuilder();
        for(int i=result.length()-1 ; i>=0 ; i--){
            reversed.append(result.charAt(i));
        }
        return reversed.toString();
    }

    public static boolean validPalindrome(String s){
        if(s.length()==0) return true;

        String result = s.replaceAll("[^a-zA-Z0-9] ", "");
        String reverseString = reverse(result);

       return result.equals(reverseString);
    }
    public static void main(String[] args) {
        String s = " ";
        System.out.println(validPalindrome(s));
    }
}
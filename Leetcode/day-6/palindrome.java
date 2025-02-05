public class palindrome{
    public static String reverse(String result){
        StringBuilder reversedString = new StringBuilder();
        for(int i=result.length()-1 ; i>=0 ; i--){
            reversedString.append(result.charAt(i));
        }

        return reversedString.toString();

    }
    public static boolean checkPalindrome(String s){
        if(s.length()==0) return true;

        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        String reverseString = reverse(result);

        return result.equals(reverseString);
    }
    public static void main(String[] args) {
        String s = "mom";
        System.out.println(checkPalindrome(s));
    }
}
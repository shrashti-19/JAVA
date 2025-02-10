public class reverseVowels{
    public static String vowelsreverse(String s){
        String vowels = "AEIOUaeiou";
        char [] result = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            while(left < right && vowels.indexOf(result[left]) == -1){
                left++;
            }
              while(left < right && vowels.indexOf(result[right]) == -1){
                right--;
            }

            //swap otherwise reverse
            char temp = result[left];
            result[left] = result[right];
            result[right] = temp;

            left++;
            right--;
        }

        return new String(result);
        
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(vowelsreverse(s));
    }
}
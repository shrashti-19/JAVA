// public class reverseWord{
//     public static String reverse(String newString){

//         StringBuilder reverseString = new StringBuilder();
//         for(int i = newString.length()-1 ; i>=0 ; i--){
//             reverseString.append(newString.charAt(i));
//         }

//         return reverseString.toString();

//     }
//     public static String reverseWords(String s){
        
//         String newString = s.replaceAll(" ", "").toLowerCase();

//         String reversedString = reverse(newString);

//         return reversedString.replaceAll("", " ");
//     }
//     public static void main(String[] args) {
//         String s = "the sky is blue";
//         System.out.println(reverseWords(s));
//     }
// }
//reversed all the letters as well

public class reverseWord{
    public static String reversedWords(String s){
        String words[] = s.trim().split("\\s+");
        StringBuilder reversedString  = new StringBuilder();
        for(int i=words.length-1 ; i>=0 ; i--){
            reversedString.append(words[i]);
            if(i>0){
                reversedString.append(" ");
            }
        }

        return reversedString.toString();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reversedWords(s));
    }
}
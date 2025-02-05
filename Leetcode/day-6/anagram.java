
import java.util.Arrays;

public class anagram{
    public static boolean checkAnagram(String s,String t){
        s = s.toLowerCase();
        t = t.toLowerCase();
        if(s.length() != t.length()){
            return false;
        }
            char[] sCharArray = s.toCharArray();
            char[] tCharArray = t.toCharArray();
            Arrays.sort(sCharArray);
            Arrays.sort(tCharArray);

            boolean result = Arrays.equals(sCharArray, tCharArray);
            if(!result){
                return false;
            }
        
        return true;

    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "na";
        System.out.println(checkAnagram(s,t));
    }
}
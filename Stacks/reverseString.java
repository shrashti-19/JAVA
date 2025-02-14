
import java.util.Stack;

public class reverseString{
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int index=0;
        int n = str.length();
        while(index!=n){
            s.push(str.charAt(index));
            index++;
        }

        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            char top = s.pop();
            result.append(top);
        }
        return result.toString();
    }
  public static void main(String[] args){
    String str = "abc";
    System.out.println(reverse(str));
  }
}
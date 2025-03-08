
import java.util.Stack;

public class three{
    public static String decodedString(String str){
        Stack<String> s = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        String current_String = "";
        int current_no = 0;
        int len = str.length();
        for(int i=0 ; i<len ; i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                current_no = current_no *10+(ch-'0');
            }else if(ch=='['){
                s.push(current_String);
                numStack.push(current_no);
                current_no = 0;
                current_String = "";
            }else if(Character.isAlphabetic(ch)){
                current_String +=ch;
            }else if(ch==']'){
                int repeat = numStack.pop();
                String prev_String = s.pop();
                StringBuilder temp = new StringBuilder(prev_String);

                for(int j=0 ; j<repeat ; j++){
                    temp.append(current_String);
                }
                current_String = temp.toString();
            }

        }
        return current_String;
        
    }
    public static void main(String[] args) {
        String str = "3[a2[c]]";
        System.out.println(decodedString(str));
    }
}
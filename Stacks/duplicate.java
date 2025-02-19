
import java.util.Stack;

public class duplicate{
    public static boolean isDuplicate(String str1){
        Stack<Character> s = new Stack<>();
        for(int i=0 ; i<str1.length() ; i++){
            char ch = str1.charAt(i);

            //opening, operand,operator
            //closing bracket
            if(ch==')'){
                int count =0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; //duplicate exist
                }else{
                    //opening pair pop
                    s.pop();
                }
            }else{
                //opening 
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(isDuplicate(str2));
        
    }
}
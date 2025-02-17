
import java.util.Stack;

public class valid{
    public static boolean validParanthesis(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else{
                //closing 
                //if stack is not empty if all closing paranthesis 
                if(stack.isEmpty()){
                    return false;
                }
                //pair form
                if(stack.peek() == '(' && ch==')' || stack.peek()=='{' && ch=='}' || stack.peek()=='[' && ch==']'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        String s = "{}([)";
        System.out.println(validParanthesis(s));
    }
}
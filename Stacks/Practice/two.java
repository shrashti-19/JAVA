import java.util.Stack;

public class two{
    public static String simplifyPath(String str){
        String res = "";
        res+="/";
        Stack <String> st = new Stack<>();
        int len = str.length();
        for(int i=0 ; i<len ; i++){
            String dir = "";
            while(i<len && str.charAt(i)=='/'){
                i++;
            }
            while(i<len && str.charAt(i)!='/'){
                dir+=str.charAt(i);
                i++;
            }

            if(dir.equals("..")==true){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(dir.equals(".")==true){
                continue;
            }else if (dir.length()!=0){
                st.push(dir);
            }
        }
        Stack<String> st1 = new Stack<>();
        while(!st.isEmpty()){
            st1.push(st.pop());
        }
        while(!st1.isEmpty()){
            if(st1.size()!=1){
                res += (st1.pop())+"/";
            }else{
                res+=st1.pop();
            }
        }
        return res;
        
    }
    public static void main(String[] args){
        String str = "/apnacollege/";
        String res = simplifyPath(str);
        System.out.println(res);
    }
}
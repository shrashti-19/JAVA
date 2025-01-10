public class third{
    public static int lengthOfString(String str){
        if("".equals(str)){
            return 0;
        }
        return lengthOfString(str.substring(1))+1;
        
    }
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(lengthOfString(str));
    }
}
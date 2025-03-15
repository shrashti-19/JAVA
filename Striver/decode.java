public class decode{
    public static String decoded(String str){
        StringBuilder result = new StringBuilder();
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            char newchar = (ch=='z') ? 'a' : (char)(ch+1);
            result.append(newchar);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Decoded String : "+ decoded(str) );
    }
}
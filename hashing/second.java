public class second{
    public static String compressString (String input){
        StringBuilder result = new StringBuilder();
        int count =1;
        for(int i=1 ; i<=input.length() ; i++){
            if(i<input.length() && input.charAt(i) == input.charAt(i-1)){
                count++;
            }else{
                result.append(input.charAt(i-1)).append(count);
                count=1;
            }
        }
        return result.toString();
    }
    public static void main(String args[]){
        String input = "dddbbuuqqmakeeb";
        String output = compressString(input);
        System.out.println(output);
    }
}
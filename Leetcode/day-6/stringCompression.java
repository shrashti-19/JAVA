public class stringCompression{
    public static int compressedStringLength(char[] chars){
       if(chars.length==1){
            return 1;
        }
        int i=0,write=0;
        while(i<chars.length){
            int count = 1;
            char currentChar = chars[i];
            while(i+1<chars.length && currentChar == chars[i+1]){
                i++;
                count++;
            }
            chars[write++] = currentChar;
            if(count>1){
                for(char ch : Integer.toString(count).toCharArray()){
                    chars[write++] = ch;
                }
            }
            i++;
        }
        return write;
    }
    public static void main(String[] args){
        char [] chars = {};
        System.out.println(compressedStringLength(chars));
    }
}
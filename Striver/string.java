public class string{
    public static String specificOrder(String x, String y){
        int [] count = new int[26];
        StringBuilder result = new StringBuilder();
        for(int i=0 ; i<x.length() ; i++){
            char ch = x.charAt(i);
            count[ch-'a']++;
        }
        for(int i=0 ; i<y.length() ; i++){
            char ch = y.charAt(i);
            while(count[ch-'a']>0){
                result.append(ch);
                count[ch-'a']--;
            }
            
        }
        for(int i=0 ; i<26  ; i++){
            while(count[i]>0){// x mein present hai but not in y
              result.append((char)(i+'a'));
              count[i]--;
            }
        }
        return result.toString();
    }
    public static void main(String args[]){
        String x =  "acabd";
        String y = "abc";
        System.out.println(specificOrder(x,y));
    }
}
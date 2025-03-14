import java.util.*;
public class Stream{
    public static void printNonRepeating(String str){
        int n = str.length();
        int[] freq = new int[26];
        Queue<Character> q  = new LinkedList<>();
        for(int i=0 ; i<n ; i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[ch-'a']>1){
                q.remove();

                // 2 cases either the queue is empty or we have the non repeating character at the front through q.peek()

                //case : 1
            }
            if(q.isEmpty()){
                    System.out.println(-1 + "");
            }else{
                    System.out.println(q.peek()+ "");
            }
            
        }
        System.out.println(" ");
       
    }
  public static void main(String[] args){
    String str = "aabccxb";
    printNonRepeating(str);
  }
}
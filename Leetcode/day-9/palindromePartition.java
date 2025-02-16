import java.util.*;

public class palindromePartition{
    public List<List<String>> partition(String s){
        List<List<String>> result = new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),result);
        return result;
    }
    public static void backtrack(String s , int start , ArrayList<String> current , List<List<String>> result){
        if(start==s.length()){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=start ; i<s.length() ; i++){
            if(isPalindrome(s,start,i)){
                current.add(s.substring(start,i+1));
                backtrack(s, i+1, current, result);
                current.remove(current.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s, int start , int i){
        while(start<i){
            if(s.charAt(start)!=s.charAt(i)){
                return false;
            }
            start++;
            i--;
        }
        return true;
    }
      public static void main(String[] args){
        String s = "aab";
        palindromePartition pp = new palindromePartition();
        List<List<String>> partitions = pp.partition(s);
        
        System.out.println("Palindrome partitions:");
        for (List<String> p : partitions) {
            System.out.println(p);
        }
      }
}
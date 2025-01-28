public class longest{
    public static int lengthOfLongestSubstring(String s){

        int n = s.length();
        int maxLen = 0;
        int[] index = new int[128]; // ASCII size
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            maxLen = Math.max(maxLen, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "bbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
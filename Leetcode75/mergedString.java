public class mergedString{
    public static String merged(String word1 , String word2){
        StringBuilder merge = new StringBuilder();
        int left=0,right=0;
        while(left<word1.length() && right<word2.length()){
            if(left<word1.length()){
                merge.append(word1.charAt(left));
                left++;

            }
            if(right<word2.length()){
                merge.append(word2.charAt(right));
                right++;
            }
        }
        while(left<word1.length()){
            merge.append(word1.charAt(left));
            left++;
        }
        while(right<word2.length()){
            merge.append(word2.charAt(right));
            right++;
        }
        return merge.toString();
    }
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrst";
        System.out.println(merged(word1,word2));
    }
}
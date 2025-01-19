public class subsets{
    public static void findsubsets(String str,String ans , int index){
         //base case
         if(index == str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
            System.out.println(ans);
            }
            return;
         }

         //recursion - kaam
         //yes choice

         findsubsets(str, ans+str.charAt(index), index+1);

         //no choice
         findsubsets(str, ans, index+1);

    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        findsubsets(str, ans, 0);

    }
}
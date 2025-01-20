public class permutations{
    public static void findPermutations(String str,String ans ){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //kaam 
        //choices at every index
        for(int i=0 ; i<str.length() ; i++){
            char curr = str.charAt(i);
            //"abcde" ="ab"+"de" = abde
            String Newstr = str.substring(0,i) + str.substring(i+1);//ending index exclusive
            //last mein kcuh nhi likha toh n-1
            findPermutations(Newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        String ans="";
        findPermutations(str,ans);
    }
}
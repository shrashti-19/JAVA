public class binaryStrings{
    public static void binaryStr(int n,int lastPlace,String str){
        // if(n==0){
        //     System.out.println(str);
        //     return;
        // }
        // if(lastPlace==0){
        //     binaryStr(n-1, 0, str+="0");
        //     binaryStr(n-1, 1, str+="1");
        // }else{
        //     //last place is 1 
        //     binaryStr(n-1, 0, str+="0");
        // }
        

        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

        binaryStr(n-1, 0, str+"0");
        if(lastPlace==0){
            binaryStr(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        binaryStr(3, 0, "");
    }
}
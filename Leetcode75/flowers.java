public class flowers{
       public static boolean flowersBed(int [] flower, int n){
          int length = flower.length;
          int count=0;
          for(int i=0 ; i<length ; i++){
            if(flower[i]==0){
                boolean leftEmpty = (i==0 || flower[i-1]==0);
                boolean rightEmpty = (i==length-1 || flower[i+1]==0);
                if(leftEmpty && rightEmpty){
                    flower[i]=1;
                    count++;
                    i++;
                }
            }
            if(count>=n){
                return true;
            }
          }
          return false;
       }
        public static void main(String[] args){
            int flower [] = {1,0,0,0,1};
            int n = 2;
            System.out.println(flowersBed(flower,n));
        }
}
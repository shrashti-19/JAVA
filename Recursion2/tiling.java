public class tiling{
    public static int tilingWays(int n){//2*n
      //base case
      if(n==0 || n==1){
        return 1;
      }
      //kaam 
      //vertical choice
      int verticalTiles = tilingWays(n-1);


      //horizontal choice
      int horizontalTiles = tilingWays(n-2);
      
      //total ways
      int totalWays = verticalTiles+horizontalTiles;
      
      return totalWays;

    }
    public static void main(String[] args) {
        System.out.println(tilingWays(3));
    }
}
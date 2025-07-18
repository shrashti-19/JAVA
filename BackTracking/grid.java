public class grid{
    public static int gridWays(int i,int j,int n,int m){
        //base case + corner case
        if(i==n-1 && j==m-1){
            return 1; //target itself
        }
        else if(i==n || j==m){
            return 0; //grid out the region 
        }

        //recursion 
        int w1 = gridWays(i+1, j, n, m);//down
        int w2 = gridWays(i, j+1, n, m);//right
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(gridWays(0,0,n,m));//n->rows m->columns
    }
}
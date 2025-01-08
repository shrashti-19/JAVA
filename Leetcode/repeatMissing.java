public class repeatMissing{
    public static int[] findandMissing(int [][]arr){
        int n =arr.length;
        int repeated=-1;
        int missing=-1;
        int[] count = new int[n*n+1];
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length ; j++){
                //if(arr[i][j]==arr[i][j+1]){
                    count[arr[i][j]]++;
                }
        }
        for(int i=1 ; i<=n*n ; i++){
            if(count[i]==2){
                repeated=i;
            }
            if(count[i]==0){
                missing=i;
            }
        }
        return new int[]{repeated,missing};    
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2},{2,3}};
        int []result = findandMissing(arr);
        System.out.println("[" + result[0]+", "+ result[1] + "]");
    }
}
public class trappingRainwater{
    public static int maxtrapWater(int heights[]){
        int n = heights.length;
        //left subarray
        int leftSubArray[] = new int[n];
        leftSubArray[0] = heights[0];
        for(int i=1 ; i<n ; i++){
            leftSubArray[i] = Math.max(heights[i],leftSubArray[i-1]);
        }
        //right subarray
        int rightSubArray[] = new int[n];
        rightSubArray[n-1] = heights[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            rightSubArray[i] = Math.max(heights[i], rightSubArray[i+1]);
        }

        int trappedWater=0;
        for(int i=0 ; i<n ; i++){
            int waterLevel = Math.min(leftSubArray[i],rightSubArray[i]);
            trappedWater += (waterLevel-heights[i]);
        }
        return trappedWater;
    }
     public static void main(String[] args){
        int heights[] = {7,0,4,2,5,0,6,4,0,6};
        System.out.println(maxtrapWater(heights));
     }
}
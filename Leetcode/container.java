public class container{
    public static int containerwithMostWater(int []height){
        int lp=0;
        int rp=height.length-1;
        int maxArea=0;
        while(lp<rp){
            int heightOfContainer = Math.min(height[lp],height[rp]);
            int width = rp-lp;
            int area = heightOfContainer*width;
            maxArea = Math.max(maxArea,area);

            if(height[lp]<=height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args){
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(containerwithMostWater(height));
    }
}
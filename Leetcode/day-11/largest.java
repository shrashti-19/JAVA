import java.util.Stack;

public class largest {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea=0;
        Stack<Integer> s = new Stack<>();
        int nsr[] = new int [n];
        int nsl[] = new int [n];
        //next right smallest element
        for(int i=n-1 ; i>=0 ; i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            nsr[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }

        s = new Stack<>();

        //next left smallest 
        for(int i=0 ; i<n ; i++){
            while(!s.isEmpty()  && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            nsl[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }

        for(int i=0 ; i<n ; i++){
            int height = heights[i];
            int width = nsr[i] - nsl[i] -1;
            int current_area = height * width;
            maxArea = Math.max(current_area,maxArea);
        }   

        return maxArea;     
    }
    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }

}
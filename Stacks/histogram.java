
import java.util.Stack;

public class histogram{
    public static int maxAreaHistogram(int arr[]){
        int maxArea=0;
        //next left smallest element
        Stack<Integer> s = new Stack<>();
        int nsl[] = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i] =s.peek();
            }
            s.push(i);
        }

        //next right smallest element 
        int nsr[] =new int[arr.length];
        s = new Stack<>();
        for(int i=arr.length-1 ; i>=0 ; i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //area calculation
        for(int i=0 ; i<arr.length ; i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currentArea= height*width;
            maxArea = Math.max(currentArea,maxArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        System.out.println(maxAreaHistogram(arr));
    }
}
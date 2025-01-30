import java.util.Arrays;
public class countTriplets{
    public static int count(int arr[],int target){
        int n = arr.length;
        int count=0;
        Arrays.sort(arr);
        for(int i=0 ; i<n-2 ; i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }

            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];

                if(sum<target){
                    left++;
                }
                else if(sum>target){
                    right--;
                }else{ //sum==target
                   int el1=arr[left],el2=arr[right];
                   int cnt1=0,cnt2=0;

                   while(left<=right && arr[left]==el1){
                    left++;
                    cnt1++;
                   }
                   while(left<=right && arr[right]==el2){
                    right--;
                    cnt2++;
                   }
                   if(el1==el2){
                    count += (cnt1 * (cnt1 - 1)) / 2;
                   }else{
                    count+=(cnt1*cnt2);
                   }

                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int arr[] = {-3,-1,-1,0,1,2};
        int target=-2;
        System.out.println(count(arr,target));
    }
}
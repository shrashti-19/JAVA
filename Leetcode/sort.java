public class sort{
    public static void sortcolor(int []nums){
        int start = 0;
        int end=nums.length-1;
        int mid=0;
        while(mid<=end){
            if(nums[mid]==0){
                int temp=nums[start];
                nums[start]=nums[mid];
                nums[mid]=temp;
                start++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                //2's position 
                int temp = nums[mid];
                nums[mid]=nums[end];
                nums[end]=temp;
                end--;
            }
        }
    }
    public static void print(int [] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]+ " ");
        }

    }
    public static void main(String[] args){
        int nums[]={2,0,2,1,1,0};
        sortcolor(nums);
        print(nums);
    }
}
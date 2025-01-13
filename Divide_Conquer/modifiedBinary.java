public class modifiedBinary{
    public static int searchInSortedandRotatedArray(int arr[],int target,int si,int ei){
       

        //base case
        if(si>ei){
            return -1;
        }
         int mid = si+ei-si/2;
        //first baar mein mil gya
        if(arr[mid]==target){
            return mid;
        }
        //kaam
        //on line l1
        if(arr[si]<=arr[mid]){
            //line left
            if(arr[si]<=target && target<arr[mid]){
                return searchInSortedandRotatedArray(arr, target, si, mid-1);
            }else{
                //rght part
                return searchInSortedandRotatedArray(arr, target, mid+1, ei);
            }
        }
        else{
            //line 2
            //line 2 right part
            if(arr[mid]<target && target<=arr[ei]){
                return searchInSortedandRotatedArray(arr, target, mid+1, ei);
            }else{
                //left part of both line 1 and line 2
                return searchInSortedandRotatedArray(arr, target, si, mid-1);
            }
        }
    }
     public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int si=0;
        int ei = arr.length-1;
        int index = searchInSortedandRotatedArray(arr,target,si,ei);
        System.out.println(index);
     }
}
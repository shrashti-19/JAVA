public class merge_sort{
    public static void mergeSort(int []arr,int si,int ei){
        //base case 
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        //left side
        mergeSort(arr, si, mid);
        //right side
        mergeSort(arr, mid+1, ei);

        //sorted left and right
        merge(arr,si,mid,ei);
    }
    public static void merge(int []arr,int si,int mid,int ei){
       //left(0,3) = 4 right(4,6) = 6-0 = 6+1
       int []temp = new int[ei-si+1];
       int i=si;//left part iterator
       int j = mid+1;//right part iterator
       int k = 0; //itertor for temp
       
       while(i<=mid && j<=ei){
        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++;
            k++;
        }else{
            temp[k]=arr[j];
            j++;
            k++;
        }
       }
       //if left part is remaining 
       while(i<=mid){
        temp[k++] = arr[i++];
       }
       while(j<=ei){
        temp[k++]=arr[j++];
       }
       
       //copy temp to original array
       for( k=0 ,i=si; k<temp.length ; k++,i++){
        arr[i] = temp[k];
       }
    }
    public static void printArr(int []arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
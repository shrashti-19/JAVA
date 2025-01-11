public class quick_sort{
    public static void quickSort(int []arr,int si,int ei){
      if(si>=ei){
        return;
      }
     
      int pivotIndex = partition(arr,si,ei);
      quickSort(arr, si,pivotIndex-1);
      quickSort(arr, pivotIndex+1, ei);
    }
    public static int partition(int []arr,int si,int ei){
         int pivot = arr[ei];
         int i=si-1;//-1 jagah banana for elements smaller than pivot
         for(int j=si ; j<ei ; j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j]=arr[i];
                 arr[i]=temp;
            }
         }
         i++;
         int temp = pivot; 
         arr[ei]=arr[i];//pivot variable call by value value at that point change rkna hai 
         arr[i]=temp;

         return i;
    }
    public static void printArr(int []arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
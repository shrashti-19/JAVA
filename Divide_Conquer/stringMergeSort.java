public class stringMergeSort{
    public static String[] mergeSort(String arr[],int si,int ei){
        if(si==ei){
            String []A = {arr[si]};
            return  A;
        }
         int mid = si+(ei-si)/2;

        String[] arr1 = mergeSort(arr, si, mid);//left part
        String[] arr2 = mergeSort(arr, mid+1, ei);//right part
        String[] arr3 = merge(arr1, arr2);
        return arr3;

    }
    public static String[] merge(String[]arr1,String[]arr2){
        int m=arr1.length;
        int n = arr2.length;
        int i=0;
        int j=0;
        int index=0;
        String[]arr3 = new String[m+n];
        while(i<m && j<n){
            if(isAlphabeticallySmaller(arr1[i],arr2[j])){
                arr3[index]=arr1[i];
                i++;
                index++;
            }else{
                arr3[index]=arr2[j];
                j++;
                index++;
            }

        }
        while(i<m){
            arr3[index]= arr1[i];
            i++;
            index++;
        }
        while(j<n){
            arr3[index]=arr2[j];
            j++;
            index++;
        }
        return arr3;
    }
    public static boolean isAlphabeticallySmaller(String str1, String str2) {
        return str1.compareTo(str2) < 0;
    }

    public static void main(String[] args) {
        String arr[]={"sun","earth","mars","mercury"};
        int si=0;
        int ei = arr.length-1;
        String []a=mergeSort(arr,si,ei);
        //print array
        for(String element : a){
            System.out.println(element);
        }
    }
}
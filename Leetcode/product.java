public class product {
    public static int[] productOfArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // Prefix product
        int running_product = 1;
        for (int i = 0; i < n; i++) {
            result[i] = running_product;
            running_product *= arr[i];
        }

        // Suffix product
        int suffix_product = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix_product;
            suffix_product *= arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int[] result = productOfArray(arr);
        System.out.print("Product of array except self: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
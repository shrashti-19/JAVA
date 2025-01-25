public class Rotate {
    public static void rotateArray(int[] nums, int d) {
        int n = nums.length;
        d = d % n; // In case d is greater than n
        reverse(nums, 0, d - 1);
        reverse(nums, d, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void print(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        int d = 2;
        rotateArray(nums, d);
        print(nums);
    }
}
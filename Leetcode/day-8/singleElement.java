public class singleElement {
    public static int getNonDuplicateElement(int nums[]) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Ensure mid is even, so we always compare pairs
            if (mid % 2 == 1) {
                mid--;
            }

            // If the pair is valid, move right pointer
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 3, 4, 4, 8}; // Example input
        System.out.println(getNonDuplicateElement(nums)); // Output: 8
    }
}

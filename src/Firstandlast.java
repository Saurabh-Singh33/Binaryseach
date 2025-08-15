public class Firstandlast {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 7,9,7, 7, 8, 8, 9, 24, 56};
        int target = 7;

        int[] ans = searchRange(nums, target);
        System.out.println("First Position: " + ans[0]);
        System.out.println("Last Position: " + ans[1]);
    }

    // Main method to search range
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // Search for first occurrence
        ans[0] = search(nums, target, true);
        // Search for last occurrence
        ans[1] = search(nums, target, false);
        return ans;
    }

    // Binary Search Helper Method
    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // Look on left side for first occurrence
                } else {
                    start = mid + 1; // Look on right side for last occurrence
                }
            }
        }
        return ans;
    }
}

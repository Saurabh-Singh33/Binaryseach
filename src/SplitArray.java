public class SplitArray {

    public static int splitArray(int[] nums, int k) {
        int left = 0, right = 0;

        // left = max element, right = total sum
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        // Binary Search
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // Helper function: check if we can split into k subarrays with max sum <= mid
    private static boolean canSplit(int[] nums, int k, int mid) {
        int count = 1;  // number of subarrays
        int currSum = 0;

        for (int num : nums) {
            if (currSum + num > mid) {
                count++;
                currSum = num;
                if (count > k) return false;
            } else {
                currSum += num;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
        System.out.println("Minimum largest sum = " + splitArray(nums, k));
    }
}

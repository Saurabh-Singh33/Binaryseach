public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println("Pivot index: " + findPivot(arr));
        System.out.println("Target found at index: " + search(arr, target));
    }

    // Search in rotated sorted array
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // Case 1: If no pivot, array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // Case 2: If pivot itself is the target
        if (nums[pivot] == target) {
            return pivot;
        }

        // Case 3: Decide whether to search in left side or right side
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    // Normal binary search
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Find pivot in rotated sorted array
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // Case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // Case 3
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("Pivot index: " + findPivot(arr));
        System.out.println("Target found at index: " + search(arr, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If no pivot → array not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If pivot is found → check if pivot is the target
        if (nums[pivot] == target) {
            return pivot;
        }

        // If target >= first element, search in left side
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Else, search in right side
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // found
            }
        }
        return -1;
    }
// it will not work for duplicate value
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: mid > next
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // Case 2: mid < prev
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // Case 3: left part is unsorted
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

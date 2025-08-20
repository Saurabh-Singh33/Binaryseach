public class SearchInMountain {
    public static void main(String[] args) {
        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;

        int ans = findInMountainArray(target, mountainArr);
        System.out.println("Target found at index: " + ans);
    }

    // Main function to search in mountain array
    static int findInMountainArray(int target, int[] arr) {
        int peak = peakInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    // Find peak in mountain array
    static int peakInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in descending part
                end = mid;
            } else {
                // you are in ascending part
                start = mid + 1;
            }
        }
        // at the end start == end == peak
        return start;
    }

    // Order agnostic binary search
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

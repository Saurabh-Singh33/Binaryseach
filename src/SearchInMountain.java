public class SearchInMountain {
    public static void main(String[] args) {
        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;

        int ans = findInMountainArray(target, mountainArr);
        System.out.println("Target found at index: " + ans);
    }

    // Main function
    public static int findInMountainArray(int target, int[] arr) {
        int peak = findPeak(arr);

        // 1. Search in ascending part
        int firstTry = binarySearch(arr, target, 0, peak, true);
        if (firstTry != -1) return firstTry;

        // 2. Otherwise search in descending part
        return binarySearch(arr, target, peak + 1, arr.length - 1, false);
    }

    // Find peak index
    public static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid; // descending
            } else {
                start = mid + 1; // ascending
            }
        }
        return start; // or end (both same here)
    }

    // Binary search (works for both asc & desc)
    public static int binarySearch(int[] arr, int target, int start, int end, boolean asc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (asc) { // ascending order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // descending order
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1; // not found
    }
}

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arrAsc = {1, 3, 5, 7, 9, 11};
        int target = 7; // define the target
        int ans = OA(arrAsc, target);
        System.out.println(ans); // Expected output: 3 (index of 7)
    }

    static int OA(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether array is sorted in ascending or descending
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
        return -1; // not found
    }
}

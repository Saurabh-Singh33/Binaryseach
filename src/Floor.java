public class Floor {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans); // Output: 14
    }
// Greatest number <= target
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid]; // Exact match
            }
            if (arr[mid] < target) {
                start = mid + 1; // Search right side
            } else {
                end = mid - 1; // Search left side
            }
        }
        return arr[end]; // end will point to floor value
    }
}

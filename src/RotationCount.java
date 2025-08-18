public class RotationCount {

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 7, 0, 1, 2};          // no duplicates
        int[] arr2 = {2, 2, 2, 3, 4, 2};             // with duplicates
        int[] arr3 = {10, 10, 10, 1, 10, 10, 10};    // mostly duplicates

        System.out.println(   countRotation(arr1));
        System.out.println(   countRotation(arr2));
        System.out.println( countRotation(arr3));
    }

    // Step 1: Wrapper function to get rotation count
    public static int countRotation(int[] arr) {
        int pivot = findPivot(arr);
        return pivot;   // number of rotations = pivot index
    }

    // Step 2: Function to find pivot (smallest element index)
    public static int findPivot(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            // Case 1: Already sorted
            if (arr[low] < arr[high]) {
                return low;
            }

            int mid = (low + high) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid - 1 + arr.length) % arr.length;

            // Case 2: mid is pivot
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }

            // Case 3: Handle duplicates
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
            }
            // Case 4: Left half sorted → pivot in right
            else if (arr[mid] >= arr[low]) {
                low = mid + 1;
            }
            // Case 5: Right half sorted → pivot in left
            else {
                high = mid - 1;
            }
        }

        return 0; // not rotated
    }
}

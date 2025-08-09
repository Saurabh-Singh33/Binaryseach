public class Ceiling {

        public static void main(String[] args) {
            int[] arr = {2, 3, 5, 9, 14, 16, 18};
            int target = 15;

            int ans = ceiling(arr, target);
            if (ans == -1) {
                System.out.println("Ceiling not found");
            } else {
                System.out.println("Ceiling is: " + ans);
            }
        }

        static int ceiling(int[] arr, int target) {
            // If target is greater than the largest number
            if (target > arr[arr.length - 1]) {
                return -1;
            }

            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return arr[mid];
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            // When loop ends, start is pointing to the smallest number greater than target
            return arr[start];
        }
    }



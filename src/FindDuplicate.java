public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        FindDuplicate fd = new FindDuplicate();
        System.out.println("Duplicate is: " + fd.findDuplicate(nums));
    }

    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {        // check if element is in its correct index
                int correct = arr[i] - 1; // correct index for arr[i] (since values are 1…n)

                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct); // place element at its correct index
                } else {
                    return arr[i]; // duplicate found
                }
            } else {
                i++; // move forward if element already in correct position
            }
        }
        return -1; // if no duplicate found
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

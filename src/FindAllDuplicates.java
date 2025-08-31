import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;  // correct index for arr[i]
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // After sorting, numbers not in the right place are duplicates
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Testing
    public static void main(String[] args) {
        FindAllDuplicates fd = new FindAllDuplicates();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(fd.findDuplicates(nums)); // Output: [2, 3]
    }
}

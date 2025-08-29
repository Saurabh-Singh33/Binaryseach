import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> missing = findDisappearedNumbers(nums);
        System.out.println("Missing numbers: " + missing);
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        // Cyclic sort: place each number at its correct index
        while (i < nums.length) {
            int correct = nums[i] - 1; // correct index for nums[i]
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Collect missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

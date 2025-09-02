import java.util.ArrayList;  // Import ArrayList class for dynamic list
import java.util.List;       // Import List interface

public class FindAllDuplicates {

    // Method to find duplicates in the given array
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;  // Start from index 0

        // Cyclic sort: place each number at its correct index
        while (i < arr.length) {
            int correct = arr[i] - 1;  // Correct index for arr[i]

            // If current element is not at its correct position → swap
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);  // Swap arr[i] with arr[correct]
            } else {
                i++;  // If already in the correct place, move to next index
            }
        }

        // After cyclic sort, elements not in correct position are duplicates
        List<Integer> ans = new ArrayList<>();  // List to store duplicates

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {  // If element is not at correct index
                ans.add(arr[index]);        // Add it to the duplicates list
            }
        }

        return ans;  // Return the list of duplicates
    }

    // Helper method to swap two elements in the array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];    // Store first element in temp
        arr[first] = arr[second]; // Assign second element to first position
        arr[second] = temp;       // Assign temp (old first) to second position
    }

    // Main method to test the program
    public static void main(String[] args) {
        FindAllDuplicates fd = new FindAllDuplicates(); // Create object of class
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};          // Input array
        System.out.println(fd.findDuplicates(nums));    // Print duplicates → [2, 3]
    }
}

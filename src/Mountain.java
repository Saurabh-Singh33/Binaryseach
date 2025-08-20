//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// Leetcode : ~ 852

public class Mountain {
    public static void main(String[]args){

    }
    public int peakIndexMountainArray(int[]arr){
        int start = 0;
        int end = arr.length - 1;

        int mid = start + (end - start)/2;
        if (arr[mid] > arr[mid + 1]){
            end = mid;
        } else {


            // You are in decreasing part of array ,it may be the ans
            //this is why end !=mid-1;


            // you are in asc part of array
            start = mid + 1;// we know that mid +1 element > mid element
        }
        // in the end , start == end and pointing to the largest number because of 2 checks above
        //start and end are always trying to find the max element in above two (2) checks
        //hence they are pointing to just one element , that is max one because thats what checks say
        //more elaboration : at every point of time for start and end they have the best possssible ans ti;; that time
        // and if we are saying only one item are remaining , hence cuz of above line that is the best possible ans
        return start; // or return end (both are equal)
    }

}

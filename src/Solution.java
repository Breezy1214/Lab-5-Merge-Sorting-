import java.util.Arrays;

// Java program for implementation of Insertion Sort
public class Solution {
    public static void main(String args[]) {
        int[] nums = {5, 2, 3, 1};
        System.out.println("Original Array: " + Arrays.toString(nums));
        int[] sorted = sortArray(nums);
        System.out.println("Sorted Array: " +Arrays.toString(sorted));

        //Test Cases
        int [] test1 = {};
        System.out.println("Original Array: " + Arrays.toString(test1));
        int[] sorted1 = sortArray(test1);
        System.out.println("Sorted Array: " +Arrays.toString(sorted1));

        int [] test2 = {7,7,7,7,7};
        System.out.println("Original Array: " + Arrays.toString(test2));
        int[] sorted2 = sortArray(test2);
        System.out.println("Sorted Array: " +Arrays.toString(sorted2));

        int [] test3 = {2,1};
        System.out.println("Original Array: " + Arrays.toString(test3));
        int[] sorted3 = sortArray(test3);
        System.out.println("Sorted Array: " +Arrays.toString(sorted3));

        int [] test4 = {-1, 5, 3, -2, 0};
        System.out.println("Original Array: " + Arrays.toString(test4));
        int[] sorted4 = sortArray(test4);
        System.out.println("Sorted Array: " +Arrays.toString(sorted4));

        int [] test5 = {50000, -50000, 0, 123, -9999, 9999, 50000};
        System.out.println("Original Array: " + Arrays.toString(test5));
        int[] sorted5 = sortArray(test5);
        System.out.println("Sorted Array: " +Arrays.toString(sorted5));

        int [] test6 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original Array: " + Arrays.toString(test6));
        int[] sorted6 = sortArray(test6);
        System.out.println("Sorted Array: " +Arrays.toString(sorted6));

        int [] test7 = {9, 7, 5, 3, 1, -1, -3};
        System.out.println("Original Array: " + Arrays.toString(test7));
        int[] sorted7 = sortArray(test7);
        System.out.println("Sorted Array: " +Arrays.toString(sorted7));

        int [] test8 = {1, 3, 5, 7, 9, 7, 5, 3, 1};
        System.out.println("Original Array: " + Arrays.toString(test8));
        int[] sorted8 = sortArray(test8);
        System.out.println("Sorted Array: " +Arrays.toString(sorted8));


    }

    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void mergeSort(int[] array, int low, int high) {
        // Calculate the mid index and invoke the mergeSort function recursively
        // and merge the sorted arrays
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);

            merge(array, low, mid, high);
        }
    }

    public static void merge(int[] array, int low, int mid, int high) {
        // Create two temporary array for holding the left sub-array and right subarray
        int n = mid - low + 1;
        int m = high - mid;

        int [] lowArray = new int[n];
        int [] highArray = new int[m];

        // Copy the appropriate elements of the original ’array’ into the left and right
        for (int i = 0; i < n; i++){
            lowArray[i] = array[low + i];
        }

        for (int j = 0; j < m; j++){
            highArray[j] = array[mid + 1 + j];
        }

        // Implement the natural merging to merge two sorted arrays
        int i = 0;
        int j = 0;
        int k = low;


        while (i < n && j < m) {
            if (lowArray[i] <= highArray[j]) {
                array[k] = lowArray[i];
                i++;
            }

            else {
                array[k] = highArray[j];
                j++;
            }

            k++;
        }

        while (i < n) {
            array[k] = lowArray[i];
            i++;
            k++;
        }

        while (j < m) {
            array[k] = highArray[j];
            j++;
            k++;
        }
    }


}

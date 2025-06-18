import java.util.Arrays;

public class BinarySearch {
    public static void main(String args[]) {
        int arr[] = {3, 8, 7, 90, 65, 23};
        int target = 90;

        // Sort the array first
        Arrays.sort(arr);  // Binary search needs sorted array

        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;  // Correct
            } else if (target > arr[mid]) {
                start = mid + 1;  // Correct
            } else {
                return mid;
            }
        }

        return -1;
    }
}

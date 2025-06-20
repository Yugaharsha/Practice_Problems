import java.util.*;  // Import utility package for Set and LinkedHashSet

public class UnionOfArrays {
    public static void main(String[] args) {
        // Define two sample arrays
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        // Call the union function and store the result
        int[] unionResult = findUnion(arr1, arr2);

        // Print the union result
        System.out.println("Union of the arrays:");
        for (int num : unionResult) {
            System.out.print(num + " ");
        }
    }

    // Function to find the union of two arrays
    public static int[] findUnion(int[] arr1, int[] arr2) {
        // Create a LinkedHashSet to store unique elements in insertion order
        Set<Integer> set = new LinkedHashSet<>();

        // Add all elements from the first array to the set
        for (int num : arr1) {
            set.add(num);  // Duplicates will be ignored automatically
        }

        // Add all elements from the second array to the set
        for (int num : arr2) {
            set.add(num);  // Duplicates will be ignored automatically
        }

        // Create an array to hold the union result
        int[] result = new int[set.size()];  // Set size = number of unique elements
        int index = 0;  // To keep track of the index in result array

        // Copy elements from the set into the result array
        for (int num : set) {
            result[index++] = num;  // Place num in result, then increment index
        }

        // Return the union array
        return result;
    }
}

    

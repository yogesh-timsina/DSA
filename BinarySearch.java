import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    // Method to perform binary search
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (array[mid] == target) {
                return mid; // Return the index of the target
            }

            // If target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                // If target is smaller, ignore the right half
                right = mid - 1;
            }
        }

        // Target is not present in array
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array input from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Taking target input from the user
        System.out.print("Enter the target value to search: ");
        int target = scanner.nextInt();

        // Sort the array
        Arrays.sort(array);

        // Perform binary search
        int result = binarySearch(array, target);

        // Output the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Output the result
        if (result != -1) {
            System.out.println("Target value found at index: " + result);
        } else {
            System.out.println("Target value not found in the array.");
        }

        scanner.close();
    }
}
 
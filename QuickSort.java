import java.util.Scanner;

public class QuickSort {

    // Function to perform QuickSort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array
            int pi = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Function to partition the array and return the partition index
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // Utility function to print the array
    public static void printArray(int[] array) {   
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Main function to test the QuickSort implementation with user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Unsorted array:");
        printArray(array);

        quickSort(array, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(array);

        scanner.close();
    }
}

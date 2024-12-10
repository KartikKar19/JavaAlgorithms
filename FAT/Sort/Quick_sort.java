package FAT.Sort;

/*
Time Complexity: O(n*log(n)) {Average & Best case}
               : O(n^2) {Worst case}
Auxiliary space: O(1)
Algorithmic Paradigm : Incremental Approach and Divide & Conquer
Sorting In Place: Yes
 */

import java.util.Scanner;

public class Quick_sort {
    // Partition function
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as the pivot
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Quicksort function
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}
package FAT;

/*
Time complexity: O(N^2) (here)
For optimized code, Time complexity: O(N)
Space complexity: O(1)
 */

import java.util.*;

public class Equilibrium_sum {
    static int findMaxSum(int[] arr, int n) {
        int res = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int prefix_sum = 0;
            int suffix_sum = 0;

            // Calculate prefix sum (elements before the current index)
            for (int j = 0; j < i; j++) {
                prefix_sum += arr[j];
            }

            // Calculate suffix sum (elements after the current index)
            for (int j = i + 1; j < n; j++) {
                suffix_sum += arr[j];
            }

            // Check if prefix and suffix sums are equal
            if (prefix_sum == suffix_sum) {
                res = Math.max(res, prefix_sum); // Update maximum sum if condition is met
            }
        }

        return res == Integer.MIN_VALUE ? -1 : res; // Return -1 if no equilibrium point is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMaxSum(arr, n));
    }
}
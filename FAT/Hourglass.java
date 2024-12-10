package FAT;

/*
Time Complexity: O(R*C)
Space Complexity: 0(1)
 */

import java.util.*;

public class Hourglass {
    public static int fixedMaxHourGlassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1]
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[6][6];
        System.out.println("Enter the elements of the 6x6 matrix row by row: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxSum = fixedMaxHourGlassSum(matrix);
        System.out.println("Maximum Hourglass Sum: " + maxSum);

        sc.close();
    }
}
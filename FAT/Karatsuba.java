package FAT;

/*
T(n)=3T(n/2)+O(n)
Time Complexity: O(N^(log₂3)) = O(N^1.585)
Space Complexity: O(log₂(N))
 */

import java.util.Scanner;

public class Karatsuba {
    // Function to perform Karatsuba multiplication
    public static long karatsuba(long x, long y) {
        // Base case for small numbers
        if (x < 10 || y < 10) {
            return x * y;
        }

        // Calculate the size of the numbers
        int n = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int half = n / 2;

        // Split x and y into two halves
        long highX = x / (long) Math.pow(10, half);
        long lowX = x % (long) Math.pow(10, half);
        long highY = y / (long) Math.pow(10, half);
        long lowY = y % (long) Math.pow(10, half);

        // Recursive calls for three multiplications
        long z0 = karatsuba(lowX, lowY);
        long z1 = karatsuba(lowX + highX, lowY + highY);
        long z2 = karatsuba(highX, highY);

        // Combine the results
        return (z2 * (long) Math.pow(10, 2 * half)) + ((z1 - z2 - z0) * (long) Math.pow(10, half)) + z0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        long num1 = sc.nextLong();
        System.out.print("Enter the second number: ");
        long num2 = sc.nextLong();

        // Compute and display the result
        long result = karatsuba(num1, num2);
        System.out.println("Product: " + result);
    }
}
package FAT.Euler_Phi;

/*
Time Complexity: O(sqrt(N))
Space Complexity: O(N)
 */

import java.util.Scanner;

public class Euler_Phi {
    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    static int phi(int n) {
        int result = 1;
        for (int i = 2; i < n; i++) {
            if (gcd(i, n) == 1) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // outputs the number of integers present between 1 and n that are co-prime to n
        System.out.println(phi(n));
    }
}
package FAT.Euler_Phi;

/*
Time complexity: O(log(min(a, b)))
 */

import java.util.Scanner;

public class Euclid_Algorithm {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD: " + gcd(a, b));
    }
}
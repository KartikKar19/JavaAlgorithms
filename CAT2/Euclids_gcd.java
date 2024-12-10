package CAT2;

import java.util.Scanner;

class Main {
    // GCD function using the Euclidean algorithm
    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers -");

        // Input two integers from the user
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        // Calculate GCD
        int g = gcd(n1, n2);

        // Print the GCD
        System.out.println("GCD is " + g);

        scan.close(); // Close the scanner to avoid resource leak
    }
}


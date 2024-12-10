package CAT2;

import java.util.Scanner;

class binary_palindrome {
    public static boolean Palindrome(int N) {
        String s = Integer.toBinaryString(N);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = s1.nextInt();
        System.out.println(Palindrome(x));
    }
}

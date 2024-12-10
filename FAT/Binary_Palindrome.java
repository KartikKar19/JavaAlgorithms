package FAT;

/*
Time Complexity: O(log N)
Space Complexity: O(1)
 */

import java.util.Scanner;

public class Binary_Palindrome {
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
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Palindrome(num));
    }
}
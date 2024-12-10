package FAT;

/*
Time Complexity: O(1)
Space Complexity: O(1)
 */

import java.util.Scanner;

public class Swap_Two_Nibbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int swap_num;
        swap_num = ((num & 0x0F) << 4 | (num & 0xF0) >> 4);
        System.out.println("Before swapping the nibble: " + num);
        System.out.println("After swapping the nibble: " + swap_num);
        sc.close();
    }
}
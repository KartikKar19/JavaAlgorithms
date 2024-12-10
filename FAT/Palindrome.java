package FAT;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        boolean output = true;

        for (int i = 0; i < str.length(); i++) {
            int j = str.length() - 1 - i;
            if(str.charAt(i) != str.charAt(j)) {
                output = false;
                break;
            }
        }

        if (output) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

import java.util.Scanner;

public class LongestConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int num) {
        int maxCount = 0;
        int count = 0;

        while (num != 0) {
            // Check if the current bit is 1
            if ((num & 1) == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
            // Right shift the number by 1 bit
            num = num >> 1;
        }

        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int result = findMaxConsecutiveOnes(num);
        System.out.println("The longest sequence of consecutive 1s in the binary representation is: " + result);
    }
}

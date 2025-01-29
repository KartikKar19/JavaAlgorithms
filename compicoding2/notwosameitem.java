import java.util.Scanner;

public class Main {

    static boolean checkCount(int[] arr, int n, int k) {
        int[] freq = new int[1001]; // Assuming elements are in the range 0-1000
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
            if (freq[arr[i]] > 2 * k) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        System.out.println(checkCount(arr, n, k));
    }
}

package FAT.Sieve;

/*
Time Complexity: O(N log log N)
Space Complexity: O(N)
*/

import java.util.*;

public class Simple_Sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean[] bool = new boolean[num];

        Arrays.fill(bool, true);

        for(int i = 2; i < Math.sqrt(num); i++) {
            if(bool[i]) {
                for(int j = (i*i); j < num; j += i) {
                    bool[j] = false;
                }
            }
        }

        System.out.printf("List of prime numbers upto %d are: %n", num);
        for(int i = 2; i < bool.length; i++) {
            if(bool[i]) {
                System.out.println(i);
            }
        }
    }
}
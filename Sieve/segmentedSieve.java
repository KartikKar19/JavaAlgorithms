package Sieve;

import java.util.*;

public class segmentedSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int sqrLimit = (int)Math.sqrt(limit);
        ArrayList<Integer> primes = new ArrayList<Integer>();
        System.out.println("Prime nos. from 1 to 25: ");
        boolean[] isPrime = new boolean[sqrLimit + 1];
        Arrays.fill(isPrime, true);
        
        for (int i = 2; i <= sqrLimit; i++) {
            if (isPrime[i]) {
                primes.add(i);
                System.out.println(i + " ");
                for (int j = (i*i); j <= sqrLimit; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        boolean[] isPrimeRange = new boolean[limit - 1];
        Arrays.fill(isPrimeRange, true);
        for (int p: primes) {
            int start = (int)Math.ceil(2.0/p)*p;
            for (int j = start; j<=limit; j+=p) {
                isPrimeRange[j-2] = false;
            }
        }

        for (int i = 2; i <= limit; i++) {
            if (isPrimeRange[i-2]) {
                System.out.println(i + " ");
            }
        }
    }
}

public class Fibonacci {
    public static int fib(int n, int[] memo) {
        return (n <= 1) ? n : (memo[n] != 0 ? memo[n] : (memo[n] = fib(n - 1, memo) + fib(n - 2, memo)));
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci(" + n + ") = " + fib(n, new int[n + 1]));
    }
}

// public class Fibonacci {
//     public static int fibonacciTopDown(int n, int[] memo) {
//         if (n <= 1) {
//             return n;
//         }
//         if (memo[n] == 0) {
//             memo[n] = fibonacciTopDown(n-1, memo) + fibonacciTopDown(n-2, memo);
//         }
//         return memo[n];
//     }

//     public static void main(String[] args) {
//         int n = 10; // You can change this to any desired value
//         int[] memo = new int[n+1]; // Initialize the memo array with the correct size
//         int result = fibonacciTopDown(n, memo);
//         System.out.println("Fibonacci(" + n + ") = " + result);
//     }
// }

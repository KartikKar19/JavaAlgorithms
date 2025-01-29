import java.util.*;

class Main {
    static int lis(int[] arr) {
        ArrayList<Integer> sub = new ArrayList<>();
        for (int num : arr) {
            int idx = Collections.binarySearch(sub, num);
            if (idx < 0) idx = -(idx + 1);
            if (idx == sub.size()) sub.add(num);
            else sub.set(idx, num);
        }
        return sub.size();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        System.out.println(lis(arr));
    }
}

import java.util.*;

public class StrobogrammaticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = sc.nextLine();       if(isStrobogrammatic(num)) {
            System.out.println(num + " is a strobogrammatic number");
        } 
      else {
            System.out.println(num + " is not a strobogrammatic number");
        }
        sc.close();
    }

    public static boolean isStrobogrammatic(String num) {
        Map<Character, Character> s_dic = new HashMap<>();
        s_dic.put('0', '0');
        s_dic.put('1', '1');
        s_dic.put('6', '9');
        s_dic.put('8', '8');
        s_dic.put('9', '6');
        int n = num.length();
        for (int i = 0, j = (n-1); i <= j; i++, j--) {
            char digit_left = num.charAt(i);
            char digit_right = num.charAt(j);
            char mapping = s_dic.getOrDefault(digit_left, '-');
            if(mapping == '-') {
                return false;
            }
            if(mapping != digit_right) {
                return false;
            }
        }
        return true;
    }
}

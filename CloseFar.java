// closeFar
// Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
// closeFar(1, 2, 10) → true
// closeFar(1, 2, 3) → false
// closeFar(4, 1, 3) → true

import java.util.*;

public class CloseFar {
    public static boolean closeFar(int a, int b, int c) {
        int dif1 = Math.abs(a - b);
        int dif2 = Math.abs(b - c);
        int dif3 = Math.abs(a - c);
        if (dif1 <= 1 && dif3 >= 2 && dif2 >= 2) {
            return true;
        } else if (dif3 <= 1 && dif1 >= 2 && dif2 >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();
        boolean closeOrFar = closeFar(a, b, c);
        System.out.println("Close Far is: " + closeOrFar);
        sc.close();
    }

}

package bilets;

public class IsPowerOfTwo {
    public static boolean isPowOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0 || n == 0) {
            return false;
        }
        return isPowOfTwo(n/2);
    }

    public static void main(String[] args) {
        int n = 7;
        if (isPowOfTwo(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        n = 32;
        if (isPowOfTwo(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        n = (int) Math.pow(2, 20);
        if (isPowOfTwo(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

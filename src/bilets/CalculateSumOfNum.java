package bilets;

public class CalculateSumOfNum {
    public static int sumOfNum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfNum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNum(12345));
        System.out.println(sumOfNum(2453));
        System.out.println(sumOfNum(1000000));
    }
}

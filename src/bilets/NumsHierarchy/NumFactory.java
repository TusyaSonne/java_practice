package bilets.NumsHierarchy;

public class NumFactory {
    public static Number createNumber(int number, int iNumber) {
        return new INumber(number, iNumber);
    }

    public static Number createNumber(int number) {
        return new Number(number);
    }

    public static void main(String[] args) {
        Number number = createNumber(4);
        number.print();

        number = createNumber(2,7);
        number.print();
    }
}

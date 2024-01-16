package bilets.NumsHierarchy;

public class INumber extends Number{
    private int iNumber;

    public INumber(int number, int iNumber) {
        super(number);
        this.iNumber = iNumber;
    }

    public int getiNumber() {
        return iNumber;
    }

    public void setiNumber() {
        this.iNumber = iNumber;
    }

    @Override
    public void print() {
        System.out.println("Число: " + getNumber() + ", Комплексное число: " + iNumber);
    }
}

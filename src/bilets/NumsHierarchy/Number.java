package bilets.NumsHierarchy;

import java.util.stream.StreamSupport;

public class Number {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void print() {
        System.out.println("Число: " + number);
    }
}

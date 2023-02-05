package Lesson4.Lesson4_6;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        Calculator calculator = new Calculator();
        calculator.add(a, b);
        calculator.minus(a, b);
    }
}

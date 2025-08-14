package JAVA_PROGRESSIVE_CHALLENGES;
//Challenge:
//Declare two variables, x and y, of type int. Assign the value 5 to x and the value 3 to y.
// Then, perform and display the result of the following operations in the console:
//Sum of x and y.
//Subtraction of x and y.
//Multiplication of x and y.
//Solution:


class ValuesForCalculator {
    private int x;
    private int y;

    ValuesForCalculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class CalculatorEx05 {
    ValuesForCalculator valuesForCalculator;

    CalculatorEx05(ValuesForCalculator valuesForCalculator) {
        this.valuesForCalculator = valuesForCalculator;
    }

    public int sumNumbers() {
        return valuesForCalculator.getX() + valuesForCalculator.getY();
    }

    public int diffNumbers() {
        return valuesForCalculator.getX() - valuesForCalculator.getY();
    }

    public int multiplyNumbers() {
        return valuesForCalculator.getX() * valuesForCalculator.getY();
    }
}


public class Ex05_BasicOperators {
    public static void main(String[] args) {
        ValuesForCalculator values = new ValuesForCalculator(5, 3);
        CalculatorEx05 calculatorEx05 = new CalculatorEx05(values);
        int sum = calculatorEx05.sumNumbers();
        int diff = calculatorEx05.diffNumbers();
        int multiplication = calculatorEx05.multiplyNumbers();
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(multiplication);
    }
}

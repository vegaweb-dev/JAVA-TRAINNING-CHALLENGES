package JAVA_PROGRESSIVE_CHALLENGES;

//Create a method called generateRandomNumber that takes two integers, a and b, and returns a random number within the range [a, b] (inclusive of a and b).
//Solution:
class ValuesEx09 {
    private int a;
    private int b;

    ValuesEx09(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

class CalculatorEx09 {
    ValuesEx09 valuesEx09;

    CalculatorEx09(ValuesEx09 valuesEx09) {
        this.valuesEx09 = valuesEx09;
    }

    public int generateRandomNumber() {
        int result = valuesEx09.getA() + (int) (Math.random() * (valuesEx09.getB() - valuesEx09.getA() + 1));
        return result;
    }
}

public class Ex09_GenerateRandomNumber {
    public static void main(String[] args) {
        ValuesEx09 valuesEx09 = new ValuesEx09(3, 7);
        CalculatorEx09 calculatorEx09 = new CalculatorEx09(valuesEx09);
        int numberResult = calculatorEx09.generateRandomNumber();
        System.out.println(numberResult);
    }
}

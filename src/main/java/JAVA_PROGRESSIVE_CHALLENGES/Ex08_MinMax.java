package JAVA_PROGRESSIVE_CHALLENGES;
//Create a method called getMinMax that takes two integers and returns an object of a MinMax class, which must contain two attributes:
//min: the smaller of the two numbers.
//max: the larger of the two numbers.
//Solution:
class ValuesEx08 {
    private int number1;
    private int number2;

    ValuesEx08(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }
}

class MinMax {
    int min;
    int max;

    MinMax(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        return "Min: " + min + " Max: " + max;
    }
}

class CalculatorEx08 {
    ValuesEx08 valuesEx08;
    MinMax minMax;

    CalculatorEx08(ValuesEx08 valuesEx08) {
        this.valuesEx08 = valuesEx08;
    }

    public int getMinValue() {
        return Math.min(valuesEx08.getNumber1(), valuesEx08.getNumber2());
    }

    public int getMaxValue() {
        return Math.max(valuesEx08.getNumber1(), valuesEx08.getNumber2());
    }
}

public class Ex08_MinMax {
    public static void main(String[] args) {
        ValuesEx08 valuesEx08 = new ValuesEx08(3, 4);
        CalculatorEx08 calculatorEx08 = new CalculatorEx08(valuesEx08);
        MinMax minMax = new MinMax(calculatorEx08.getMinValue(), calculatorEx08.getMaxValue());

        System.out.println(minMax);
    }

}

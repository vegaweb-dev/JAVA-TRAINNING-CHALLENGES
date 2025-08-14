package JAVA_PROGRESSIVE_CHALLENGES;
//Declare a variable of type double called number and assign it the value 9.7. Then, use the Math class to:
//Round number to the nearest integer.
//Get the absolute value of number minus 15.
//Calculate the square root of number.

//Solution:

class ValuesEx07 {
    private double number;

    ValuesEx07(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }
}

class CalculatorEx07 {
    ValuesEx07 valuesEx07;

    CalculatorEx07(ValuesEx07 valuesEx07) {
        this.valuesEx07 = valuesEx07;
    }

    public double getRoundedNumber() {
        return Math.round(valuesEx07.getNumber());
    }

    public double getAbsoluteValue() {
        return Math.abs(valuesEx07.getNumber()-15);
    }

    public double getSquareRoot() {
        return Math.sqrt(valuesEx07.getNumber());
    }
}

public class Ex07_BasicOperators {

    public static void main(String[] args) {
        ValuesEx07 valuesEx07 = new ValuesEx07(9.7);
        CalculatorEx07 calculatorEx07 = new CalculatorEx07(valuesEx07);
        double roundedNumberResult = calculatorEx07.getRoundedNumber();
        double absoluteNumberResult = calculatorEx07.getAbsoluteValue();
        double powerNumberResult = calculatorEx07.getSquareRoot();

        System.out.println(roundedNumberResult);
        System.out.println(absoluteNumberResult);
        System.out.println(powerNumberResult);
    }

}

package JAVA_PROGRESSIVE_CHALLENGES;
//Challenge
//Write a Java program that determines if an integer is even or odd. To do this:
//Create an EvenOdd class with a determine(int num) method that returns "Even" if the number is even and "Odd" if it is odd.
//Implement a print() method that displays the result in the console.
//In the main method, test the method with different numbers.
//Here is my solution:
class ValueEx10 {
    private int number;

    ValueEx10(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

class CalculatorEX10 {
    ValueEx10 valueEx10;

    CalculatorEX10(ValueEx10 valueEx10) {
        this.valueEx10 = valueEx10;
    }

    public boolean determineIfOddOrEven() {
        if (valueEx10.getNumber() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

public class Ex10_OddOrEven {
    public static void main(String[] args) {
        ValueEx10 valueEx10 = new ValueEx10(2);
        CalculatorEX10 calculatorEX10 = new CalculatorEX10(valueEx10);
        boolean result = calculatorEX10.determineIfOddOrEven();
        System.out.println(result);

    }
}

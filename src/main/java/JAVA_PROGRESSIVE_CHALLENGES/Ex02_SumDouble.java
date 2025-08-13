package JAVA_PROGRESSIVE_CHALLENGES;
//Challenge
//Declare three variables of type double named num1, num2, and result. Assign the value 5.5 to num1 and 2.2 to num2.
// Then, sum both variables and store the result in the result variable.
// Finally, print the value of result to the console.

//Solution: I solve the challenge seeking to follow professional practices like encapsulating the value of the nombers
// and creating a class that only computes the numbers. This way a separate values and logic and make the final execution in the main of the main class.

class Numbers {
    private double num1;
    private double num2;

    Numbers(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum2() {
        return num2;
    }

    public double getNum1() {
        return num1;
    }


}

class Calculator {
    double sumNumbers(Numbers numbers) {
        double result = numbers.getNum1() + numbers.getNum2();
        System.out.println(result);
        return result;

    }
}

public class Ex02_SumDouble {
    public static void main(String[] args) {
        Numbers numbersForSum = new Numbers(5.5, 2.2);
        Calculator sumResult = new Calculator();
        sumResult.sumNumbers(numbersForSum);
    }

}

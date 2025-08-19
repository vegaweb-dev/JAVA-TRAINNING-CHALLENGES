package JAVA_PROGRESSIVE_CHALLENGES;

//Create a Java program that determines whether an entered number is prime or not prime.
//Requirements:
//There must be a POJO class to store the response ("is prime" or "is not prime").
//Implement a Calculator class with a method to check if a number is prime.
//Use a method that returns an object of the POJO class with the response.
//Solution:

class ValueEx11 {
    private int value;

    ValueEx11(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class POJO {
    private String response;

    POJO(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }
}


class CalculatorEx11 {
    ValueEx11 valueEx11;

    CalculatorEx11(ValueEx11 valueEx11) {
        this.valueEx11 = valueEx11;
    }

    boolean isPrimeOrNot() {
        if (valueEx11.getValue() < 2) {
            return false;
        }
        if (valueEx11.getValue() == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(valueEx11.getValue()); i++) {
            if (valueEx11.getValue() % i == 0) {
                return false;

            }
        }
        return true;
    }

    POJO responseContainer() {
        if (isPrimeOrNot()) {
            return new POJO("is prime");
        } else {
            return new POJO("is not prime");
        }
    }


}


public class Ex11_IsPrimeOrNot {
    public static void main(String[] args) {
        ValueEx11 valueEx11 = new ValueEx11(6);
        CalculatorEx11 calculatorEx11 = new CalculatorEx11(valueEx11);
        POJO finalResponse = calculatorEx11.responseContainer();
        System.out.println(finalResponse.getResponse());
    }
}

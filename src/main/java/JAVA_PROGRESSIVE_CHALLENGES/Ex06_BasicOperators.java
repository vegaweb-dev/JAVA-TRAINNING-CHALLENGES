package JAVA_PROGRESSIVE_CHALLENGES;
//Declare two variables of type double named base and exponent, assigning them the values 2.0 and 3.0, respectively.
// Then, use the Math class to calculate the power of base raised to exponent and display the result on the console.
//Solution:
class ValuesEx06{
    private double base;
    private double exponent;

    ValuesEx06(double base, double exponent){
        this.base=base;
        this.exponent=exponent;
    }

    public double getBase() {
        return base;
    }

    public double getExponent() {
        return exponent;
    }
}

class CalculatorEx06{
    ValuesEx06 valuesEx06;
    CalculatorEx06(ValuesEx06 valuesEx06){
        this.valuesEx06=valuesEx06;

    }

    public double getPower(){
        double power = Math.pow(valuesEx06.getBase(),valuesEx06.getExponent());
        return power;
    }
}
public class Ex06_BasicOperators {
    public static void main(String[] args){
        ValuesEx06 valuesEx06= new ValuesEx06(2.0 , 3.0);
        CalculatorEx06 calculatorEx06 = new CalculatorEx06(valuesEx06);
        double result = calculatorEx06.getPower();
        System.out.println(result);

    }
}

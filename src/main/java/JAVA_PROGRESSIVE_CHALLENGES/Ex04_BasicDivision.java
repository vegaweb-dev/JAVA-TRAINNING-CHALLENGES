package JAVA_PROGRESSIVE_CHALLENGES;
//Challenge:
//Declare two integer variables `a` and `b` with the values 10 and 3, respectively.
// Then, calculate and print the result of the division of `a` by `b` to the console.
//Solution:
//In my solution I encapsulate values and separate responsabilities in case I want to decouple the code for more scalability.
class Values{
    private int value1;
    private int value2;

    Values(int value1, int value2){
        this.value1=value1;
        this.value2=value2;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }
}

class CalculateDivision{
    public void compute(Values values){
        int value1 = values.getValue1();
        int value2 = values.getValue2();
        float division= value1/value2;
        System.out.println(division);
    }

}

public class Ex04_BasicDivision {
    public static void main(String[] args){
        Values values = new Values(10,3);
        CalculateDivision calculateDivision = new CalculateDivision();
        calculateDivision.compute(values);
    }
}

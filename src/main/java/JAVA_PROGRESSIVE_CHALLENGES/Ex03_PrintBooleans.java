package JAVA_PROGRESSIVE_CHALLENGES;


//Declare two boolean variables named `isAdult` and `hasPermission`.
// Assign `true` to `isAdult` and `false` to `hasPermission`.
// Then, print both values to the console on separate lines.

class GenerateBoolean {
    private boolean isAdult;
    private boolean hasPermission;

    GenerateBoolean(boolean isAdult, boolean hasPermission) {
        this.isAdult = isAdult;
        this.hasPermission = hasPermission;
    }

    public boolean getIsAdult() {
        return isAdult;
    }

    public boolean getHasPermission() {
        return hasPermission;
    }
}

class Print {
    public boolean printValue(GenerateBoolean generateBoolean) {
        boolean printValue1 = generateBoolean.getIsAdult();
        boolean printValue2 = generateBoolean.getHasPermission();
        System.out.println(printValue1);
        System.out.println(printValue2);
        return printValue1;
    }

}

public class Ex03_PrintBooleans {
    public static void main(String[] args) {
        GenerateBoolean generateBoolean = new GenerateBoolean(true, false);
        Print printValues = new Print();
        printValues.printValue(generateBoolean);
    }

}

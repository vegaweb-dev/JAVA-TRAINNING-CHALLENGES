package JAVA_TRAINNING_HACKERRANK;

import java.util.Scanner;

class Add {
    int add() {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int result = number1 + number2;
        scan.nextLine();
        System.out.println(result);
        scan.close();
        return result;

    }
}

public class AddNumbers {
    public static void main(String[] args) {
        Add addNumbers = new Add();
        int result = addNumbers.add();
        System.out.println(result);
    }
}



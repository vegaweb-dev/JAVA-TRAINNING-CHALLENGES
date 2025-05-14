package JAVA_TRAINNING_HACKERRANK;

import java.util.Scanner;

class IsPalindrome {
    String isPalindrome() {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        scan.close();
        String value = "false";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt((word.length() - 1) - i)) {
                System.out.println("NO");
                value = "no";
                return value;
            }
        }
        return value;
    }
}


public class Palindrom {


    public static void main(String[] args) {
        IsPalindrome obj = new IsPalindrome();
        String res = obj.isPalindrome();
        System.out.println(res);
    }
}

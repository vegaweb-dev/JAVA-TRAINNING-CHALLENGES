package JAVA_PROGRESSIVE_CHALLENGES;
//Problem:
//Create a variable of type int named age, assign the value 25 to it, and then print its value to the console.
//Solution:
//For the solution I prefer to create a function that receives the age a return it. Then I print the age in the main.
//public class Ex01_PrintInteger {
//    static int throwAge(int age) {
//        return age;
//    }
//
//
//    public static void main(String[] args) {
//        Ex01_PrintInteger printInt = new Ex01_PrintInteger();
//        int result = printInt.throwAge(25);
//        System.out.println(result);
//    }
//}


//From the solution above I can decouple the code like so:


//class ReturnInt {
//    public int throwAge(int age) {
//        return age;
//    }
//}
//
//public class Ex01_PrintInteger {
//    public static void main(String[] args) {
//        ReturnInt object = new ReturnInt();
//        System.out.println(object.throwAge(24));
//    }
//
//}

//I can also do it way cleaner, like so:


class Age {
    private int age;

    public Age(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class PrintAgeService {
    public void printAge(Age age) {
        System.out.println(age.getAge());
    }
}

public class Ex01_PrintInteger {
    public static void main(String[] args) {
        Age object = new Age(25);
        PrintAgeService printAgeService = new PrintAgeService();
        printAgeService.printAge(object);
    }
}
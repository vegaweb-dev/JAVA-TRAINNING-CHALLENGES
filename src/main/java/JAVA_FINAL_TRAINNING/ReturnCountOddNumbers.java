package JAVA_FINAL_TRAINNING;
//Escribe un método en Java que reciba una matriz int[][] y retorne la cantidad de números impares que contiene.
//create class with method getOdds

import java.util.Arrays;

class CountOddNumbers {
    int countOddNumbers(int[][] myArray) {
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (myArray[i][j] % 2 != 0) {
                    count += 1;
                }
            }
        }
        //print count of odd numbres
        System.out.println("THE FOLLOWING LINE PRINTS THE COUNT OF ODD NUMBERS");
        System.out.println(count);
        return count;
    }
}

class CreateMatrix {
    int[][] genMatrix() {
        int row = (int) Math.floor(Math.random() * 10) + 1;
        int column = (int) Math.floor(Math.random() * 10) + 1;
        int[][] initialMatrix = new int[row][column];
        //print random-sized matrix of zeros
        System.out.println("PRINT MATRIX OF ZEROS: ");
        System.out.println(Arrays.deepToString(initialMatrix));
        //fill matrix with random values
        for (int i = 0; i < initialMatrix.length; i++) {
            for (int j = 0; j < initialMatrix[i].length; j++) {
                int value = (int) Math.floor(Math.random() * 10) + 1;
                initialMatrix[i][j] = value;
            }
        }
        //print matrix with random values
        System.out.println("PRINT MATRIZ OF RANDOM VALUES");
        System.out.println(Arrays.deepToString(initialMatrix));
        return initialMatrix;
    }
}

public class ReturnCountOddNumbers {
    public static void main(String[] args) {
        CreateMatrix createMatrix = new CreateMatrix();
        int[][] matrixToBeFiltered = createMatrix.genMatrix();
        CountOddNumbers countOdds = new CountOddNumbers();
        int count = countOdds.countOddNumbers(matrixToBeFiltered);
    }
}

package JAVA_FINAL_TRAINNING;

import java.util.Arrays;

//create a separated class that has the filterEven  method inside of it.
class ReturnEvenValues {
    int filterEven(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    count += 1;
                }
            }
        }

        System.out.println("THE NUMBER OF EVEN VALUES IS: " + count);
        return count;
    }
}

//Generate a random-sized matrix
class GenerateMatrix {
    int[][] generateMatrix() {
        //Generate number of row and column
        int row = (int) Math.floor(Math.random() * 10) + 1;
        int column = (int) Math.floor(Math.random() * 10) + 1;

        //Generate matrix of zeros
        int[][] generatedMatrix = new int[row][column];

        //Print matrix of zeros
        System.out.println("THE FOLLOWING LINE SHOWS THE RANDOM-SIZED MATRIZ OF ZEROS:");
        System.out.println(Arrays.deepToString(generatedMatrix));

        //Put random values all along the matrix
        for (int i = 0; i < generatedMatrix.length; i++) {
            for (int j = 0; j < generatedMatrix[i].length; j++) {
                int value = (int) Math.floor(Math.random() * 10) + 1;
                generatedMatrix[i][j] = value;
            }
        }

        //Print random matrix with values
        System.out.println("THE FOLLOWING LINE PRINTS THE MATRIX GENERATED WITH VALUES");
        System.out.println(Arrays.deepToString(generatedMatrix));
        return generatedMatrix;
    }
}


public class ReturnEvenMatrix {


    public static void main(String[] args) {
        //ReturnEvenValues   GenerateMatrix
        GenerateMatrix matrixForEvaluation = new GenerateMatrix();
        /**/
        int[][] generatedMatrix = matrixForEvaluation.generateMatrix();

        ReturnEvenValues numberOfEvenValues = new ReturnEvenValues();
        /**/
        int numberOfEven = numberOfEvenValues.filterEven(generatedMatrix);
        System.out.println(numberOfEven);
    }
}
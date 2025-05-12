package JAVA_FINAL_TRAINNING;

import JAVA_PROGRESSIVE_CHALLENGES.SumaMatrices;

import java.util.Arrays;

//create class with method to find highest value
class FindHighestValue {
    int getHighestValue(int[][] anyMatrix) {
        int count = 0;
        for (int i = 0; i < anyMatrix.length; i++) {
            for (int j = 0; j < anyMatrix[i].length; j++) {
                if (anyMatrix[i][j] > count) {
                    count = anyMatrix[i][j];
                }
            }
        }
        //print highest value
        System.out.println("THE FOLLOWING LINE PRINTS THE HIGHEST VALUE FOUND");
        System.out.println(count);
        return count;
    }
}

//create class with method to generate matrix

class GenerateRandomSizedMatrix {
    int[][] matrix() {
        int row = (int) Math.floor(Math.random() * 10) + 1;
        int column = (int) Math.floor(Math.random() * 10) + 1;
        //generate a random-sized matrix with zero values
        int[][] matrixOfZeros = new int[row][column];
        //print zero values matrix
        System.out.println("THE FOLLOWING LINE SHOWS THE ZERO VLAUES MATRIX GENERATED");
        System.out.println(Arrays.deepToString(matrixOfZeros));
        //fill matrix with random values
        for (int i = 0; i < matrixOfZeros.length; i++) {
            for (int j = 0; j < matrixOfZeros[i].length; j++) {
                int value = (int) Math.floor(Math.random() * 10) + 1;
                matrixOfZeros[i][j] = value;
            }
        }
        //print matrix with random values
        System.out.println("THE FOLLOWING LINE SHOWS THE RANDOM VALUES MATRIX");
        System.out.println(Arrays.deepToString(matrixOfZeros));
        //print matrix e=with values
        System.out.println("THE FOLLOWING LINES PRINTS MATRIX WITH VALUE");
        System.out.println(Arrays.deepToString(matrixOfZeros));
        return matrixOfZeros;
    }
}


public class HighestValueMatrix {


    public static void main(String[] args) {
        //instanciate class GenenerateRandomSi...
        GenerateRandomSizedMatrix generateRandomSizedMatrix = new GenerateRandomSizedMatrix();
        int[][] matrix = generateRandomSizedMatrix.matrix();
        //instanciate class findHigh...
        FindHighestValue findHighestValue = new FindHighestValue();
        int highest = findHighestValue.getHighestValue(matrix);
        //print highest value
        System.out.println(highest);

    }
}

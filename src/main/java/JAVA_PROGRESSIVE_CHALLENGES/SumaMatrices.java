package JAVA_PROGRESSIVE_CHALLENGES;

//Ejercicio 18:

//Escribe una clase llamada SumaMatrices que contenga un método llamado sumarMatrices que:
// reciba dos matrices de enteros de tamaño 3x3 como parámetros y devuelva una nueva matriz que:
// sea la suma de ambas matrices. El resultado debe ser impreso en consola.


/*import java.util.Arrays;

public class SumaMatrices {

    static int[][] generarMatrizAleatoria(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
        return matriz;
    }

    static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
        }

        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    static void imprimirMatriz(int[][] matriz) {
        Arrays.stream(matriz)
                .map(Arrays::toString)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        int filas = (int) (Math.random() * 10 + 1);
        int columnas = (int) (Math.random() * 10 + 1);

        int[][] matrizA = generarMatrizAleatoria(filas, columnas);
        int[][] matrizB = generarMatrizAleatoria(filas, columnas);

        int[][] resultado = sumarMatrices(matrizA, matrizB);

        System.out.println("Matriz A:");
        imprimirMatriz(matrizA);
        System.out.println("\nMatriz B:");
        imprimirMatriz(matrizB);
        System.out.println("\nSuma:");
        imprimirMatriz(resultado);
    }
}*/

import java.util.Arrays;

public class SumaMatrices {
    //metodo para crear matrices

    static int[][] creaMatriz(int fila, int columna) {
        int[][] matrizInicial = new int[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                int value = (int) Math.floor(Math.random() * 10) + 1;
                matrizInicial[i][j] = value;
            }
        }
        System.out.println("matriz generada" + Arrays.deepToString(matrizInicial));
        return matrizInicial;
    }

    //metodo para sumar las matrices

    static int[][] sumaMatrices(int[][] matrizA, int[][] matrizB) {
        //genero matriz vacia
        int fila = matrizA.length;
        System.out.println("VALOR FILA" + fila);
        int columna = matrizA[0].length;
        System.out.println("VALOR COLUMNA" + columna);
        int[][] matrizFinal = new int[fila][columna];
        System.out.println("matriz vaccia" + Arrays.deepToString(matrizFinal));

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizFinal[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("matriz llena" + Arrays.deepToString(matrizFinal));
        return matrizFinal;
    }

    public static void main(String[] args) {
        int fila = (int) Math.floor(Math.random() * 10) + 2;
        int columna = (int) Math.floor(Math.random() * 10) + 2;

        int[][] matriz1 = creaMatriz(fila, columna);
        int[][] matriz2 = creaMatriz(fila, columna);

        int[][] resultado = sumaMatrices(matriz1, matriz2);
        System.out.println("resultado final" + Arrays.deepToString(resultado));
    }
}
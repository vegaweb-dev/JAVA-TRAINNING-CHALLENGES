package JAVA_CHALLENGES_MATRICES;


/*
Ejercicio 1/30 – Nivel: Básico
Enunciado
Escribe un método en Java que reciba una matriz int[][] matriz y retorne la suma de todos los elementos de la matriz.
solucion 1.


 */

/*Solucion 1
public class MatrixEx1 {
    public static int sumarElementos( int[][] matriz){
        int acumulador = 0;

        for(int i =0; i < matriz.length; i++){
            for(int j =0; j < matriz[i].length; j++){
                acumulador+=matriz[i][j];
            }

        }
        System.out.println(acumulador);
        return acumulador;

    }


    public static void main(String[] args){

       int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
       sumarElementos(matriz);

    }
}*/


/*solucion 2
public class MatrixEx1{
    public static int sumar(int[][] arreglo){
        int acumulador =0;
        for(int i =0; i < arreglo.length;i++){
            for(int j=0; j < arreglo[i].length;j++){
                acumulador+=arreglo[i][j];
                System.out.println(acumulador);
            }
        }
        return acumulador;
    }
    public static void main(String[] args){
        int filas = (int) Math.floor(Math.random()*10)+1;
        int columnas = (int) Math.floor(Math.random()*10)+1;

        int [][] matriz = new int[filas][columnas];
        //verificamos la matriz creada
     for (int i =0; i < matriz.length;i++){
            for(int j=0; j< matriz[i].length;j++){
                System.out.println(matriz[i][j]);
            }
        }

        //llenamos la matriz
        for(int i =0; i < matriz.length;i++){
            for(int j =0; j< matriz[i].length;j++){
                int valor = (int) Math.floor(Math.random()*10);
                matriz[i][j] = valor;
            }

        }

        //verificamos la matriz llena
        for(int i=0; i < matriz.length;i++){
            for (int j=0; j < matriz[i].length;j++){
                System.out.println(matriz[i][j]);
            }
        }

        // sumamos los valores mediante llamada de la funcion
        int resultado = sumar(matriz);
        System.out.println(resultado);
    }
}*/


//solucion 3

//import java.util.ArrayList;
//
//public class MatrixEx1 {
//
//    //Creamos la funcion
//    public static int sumarElementos(ArrayList<ArrayList<Integer>> arreglo) {
//        int acumulador = 0;
//
//        for (int i = 0; i < arreglo.size(); i++) {
//            for (int j = 0; j < arreglo.get(i).size(); j++) {
//                acumulador += arreglo.get(i).get(j);
//                System.out.println(acumulador);
//            }
//        }
//        return acumulador;
//    }
//
//    public static void main(String[] args) {
//        //creamos el arrylist
//        ArrayList<ArrayList<Integer>> myArray = new ArrayList<ArrayList<Integer>>();
//        int filas = (int) Math.floor(Math.random() * 10) + 1;
//        int columnas = (int) Math.floor(Math.random() * 10) + 1;
//        for (int i = 0; i < filas; i++) {
//            myArray.add(new ArrayList<Integer>());
//            for (int j = 0; j < columnas; j++) {
//                int valor = (int) Math.floor(Math.random() * 10);
//                myArray.get(i).add(valor);
//            }
//        }
//
//        //mostramos todos los elementos del arreglo creado
//        for (int i = 0; i < myArray.size(); i++) {
//            for (int j = 0; j < myArray.get(i).size(); j++) {
//                System.out.println(myArray.get(i).get(j));
//            }
//        }
//
//        //la siguiente linea nos daria la suma de todos los elemetos de los arreglos
//        sumarElementos(myArray);
//    }
//}
//

